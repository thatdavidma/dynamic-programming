# 746. Min Cost Climbing Stairs

# You are given an integer array cost where cost[i] is the cost of ith step on a staircase. Once you pay the cost, you can either climb one or two steps.

# You can either start from the step with index 0, or the step with index 1.

# Return the minimum cost to reach the top of the floor.

def minCostClimbingStairs(self, cost: List[int]) -> int:
    # [10 ,15, 20] ,0
    cost.append(0)
    # Iterating backwards to and replace in memory the costs to reach final destination per index
    # Backtracing per index cost
    for i in range(len(cost)-3, -1, -1):
        cost[i] += min(cost[i + 1], cost[i + 2])
    return min(cost[0], cost[1])