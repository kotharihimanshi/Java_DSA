
"""
There is a tournament where n players are participating. The players are standing in a single row and are numbered from 1 to n based on their initial standing position (player 1 is the first player in the row, player 2 is the second player in the row, etc.).

The tournament consists of multiple rounds (starting from round number 1). In each round, the ith player from the front of the row competes against the ith player from the end of the row, and the winner advances to the next round. When the number of players is odd for the current round, the player in the middle automatically advances to the next round.

The players numbered firstPlayer and secondPlayer are the best in the tournament. They can win against any other player before they compete against each other. If any two other players compete against each other, either of them might win, and thus you may choose the outcome of this round.

Given the integers n, firstPlayer, and secondPlayer, return an integer array containing two values, the earliest possible round number and the latest possible round number in which these two players will compete against each other, respectively.

Example 1:
Input: n = 11, firstPlayer = 2, secondPlayer = 4
Output: [3, 4]

Example 2:
Input: n = 5, firstPlayer = 1, secondPlayer = 5
Output: [1, 1]

Constraints:
2 <= n <= 28
1 <= firstPlayer < secondPlayer <= n
"""

from functools import lru_cache

class Solution:
    def earliestAndLatest(self, n, firstPlayer, secondPlayer):
        @lru_cache(None)
        def dp(players, round_num):
            i, j = 0, len(players) - 1
            while i < j:
                a, b = players[i], players[j]
                if (a == firstPlayer and b == secondPlayer) or (a == secondPlayer and b == firstPlayer):
                    return (round_num, round_num)
                i += 1
                j -= 1

            results = []

            def simulate(i, j, current):
                if i > j:
                    results.append(tuple(sorted(current)))
                    return
                if i == j:
                    simulate(i + 1, j - 1, current + [players[i]])
                    return

                a, b = players[i], players[j]

                if a in (firstPlayer, secondPlayer):
                    simulate(i + 1, j - 1, current + [a])
                elif b in (firstPlayer, secondPlayer):
                    simulate(i + 1, j - 1, current + [b])
                else:
                    simulate(i + 1, j - 1, current + [a])
                    simulate(i + 1, j - 1, current + [b])

            simulate(0, len(players) - 1, [])

            min_round = float('inf')
            max_round = float('-inf')

            for res in results:
                next_min, next_max = dp(res, round_num + 1)
                min_round = min(min_round, next_min)
                max_round = max(max_round, next_max)

            return (min_round, max_round)

        initial_players = tuple(range(1, n + 1))
        return list(dp(initial_players, 1))


# Example usage
if __name__ == "__main__":
    sol = Solution()
    print(sol.earliestAndLatest(11, 2, 4))  # Output: [3, 4]
    print(sol.earliestAndLatest(5, 1, 5))   # Output: [1, 1]
