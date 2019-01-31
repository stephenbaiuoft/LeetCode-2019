package stack_array_property;

/*
*
Given a list of daily temperatures T, return a list such that,
for each day in the input, tells you how many days you would have to wait until a warmer temperature.
If there is no future day for which this is possible, put 0 instead.

For example, given the list of temperatures T = [73, 74, 75, 71, 69, 72, 76, 73],
 your output should be [1, 1, 4, 2, 1, 1, 0, 0].

Note: The length of temperatures will be in the range [1, 30000].
Each temperature will be an integer in the range [30, 100].
* */

import java.util.Stack;

/*
* 思路
*
* 做一个array 然后你看一下根据你如何 push/pop 数据 这样可以保证 array里面的顺序一定是descending 就十分重要！！！
*
* */
public class L739_DailyTemperatures_M {
    public int[] dailyTemperatures(int[] T) {
        int[] rez = new int[T.length];
        // array to store indexes that are descending
        int[] array = new int[T.length];
        // array head -> -1 to indicate not initialized
        int aHead = -1;

        for (int i = 0; i < T.length; i++) {
            // when we find that i is larger than the aHead elements
            while (aHead > -1 && T[array[aHead]] < T[i]) {
                int idx = array[aHead]; // get the index
                rez[idx] = i - idx; // compute the off set
                aHead--; // update the aHead to go to the next potential smaller value
            }

            // aHead is > -1 or T[ array[aHead] ] is actually >= T[i]
            aHead ++; // update aHead to move to next available spot
            array[aHead] = i; // save i index
        }

        return rez;
    }

    // 注意stack是 FILO！！！or LIFO (so last in, first out and order is exactly what we need given left to right order
    // queue FIFO
    public int[] dailyTemperaturesStack(int[] temperatures) {
        // stack is FIFO --> so always the previous one
        Stack<Integer> stack = new Stack<>();
        int[] ret = new int[temperatures.length];
        for(int i = 0; i < temperatures.length; i++) {

            while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int idx = stack.pop();
                ret[idx] = i - idx;
            }
            stack.push(i);
        }
        return ret;
    }
}