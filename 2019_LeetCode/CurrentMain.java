import algorithm.related.design.L528_RandomPickWithWeight_M;
import algorithm.related.structure.L315_CountSmaller_H;
import algorithm.related.structure.NumArray;
import bfs_or_dfs.L947_MostStonesRemovedWithSameRowOrCol_M;
import binarysearch.L475_Heaters_E;
import binarysearch.binary_search_test;
import com.company.TestClass;
import common.data.types.TreeNode;
import custom_data_structure.L900_RLEIterator_M;
import custom_data_structure.MyCalendarTwo;
import dynamic_programming.L135_Candy_H;
import dynamic_programming.L562_LongestLineOfConsecutiveOneInMatrix_M;
import dynamic_programming.L940_DistinctSubsequencesII_H;
import heap_minqueue.L857_MinCostKWorkers_H;
import recursion_subproblem.L25_ReverseNodesInKGroup_H;
import sorting.L973_KClosestPoints_M;
import stack_array_property.L394_DecodeString_M;
import string_processing.CustomSortString_M;
import string_processing.L316_RemoveDuplicateLetters;
import string_processing.L524_LongestWordInDicThroughDeleting_M;
import string_processing.L809_ExpressiveWords_M;
import tree_traversal.L222_CountCompleteTreeNodes_M;
import twopointers.hashmap.string.L18_4Sum_M;
import twopointers.hashmap.string.L833_FindAndReplaceInString_M;


import java.util.*;

public class CurrentMain {
    // testClass to try out java cases
    private TestClass testClass = new TestClass();

    public static void main(String[] args) {
        L25_ReverseNodesInKGroup_H p =new L25_ReverseNodesInKGroup_H();
//        L394_DecodeString_M p = new L394_DecodeString_M();
//        L973_KClosestPoints_M p = new L973_KClosestPoints_M();
//        NumArray p = new NumArray();
//        L316_RemoveDuplicateLetters r = new L316_RemoveDuplicateLetters();

//        CustomSortString_M s = new CustomSortString_M();
//        L940_DistinctSubsequencesII_H h = new L940_DistinctSubsequencesII_H();
//        L524_LongestWordInDicThroughDeleting_M m = new L524_LongestWordInDicThroughDeleting_M();

//        L475_Heaters_E h = new L475_Heaters_E();
//        L562_LongestLineOfConsecutiveOneInMatrix_M p = new L562_LongestLineOfConsecutiveOneInMatrix_M();
//        L900_RLEIterator_M m = new L900_RLEIterator_M();

//        L809_ExpressiveWords_M e = new L809_ExpressiveWords_M();
//        L135_Candy_H c = new L135_Candy_H();
//        binary_search_test t = new binary_search_test();
//        L833_FindAndReplaceInString_M f = new L833_FindAndReplaceInString_M();
//        L222_CountCompleteTreeNodes_M m = new L222_CountCompleteTreeNodes_M();
//        L857_MinCostKWorkers_H h = new L857_MinCostKWorkers_H();
//        L947_MostStonesRemovedWithSameRowOrCol_M v = new L947_MostStonesRemovedWithSameRowOrCol_M();
//        L18_4Sum_M s = new L18_4Sum_M();

//        L528_RandomPickWithWeight_M p = new L528_RandomPickWithWeight_M();
//        L315_CountSmaller_H p = new L315_CountSmaller_H();
//        FenwickTreeDemo d = new FenwickTreeDemo();
//        L139_WordBreak_M p = new L139_WordBreak_M();


        // L849_MaxDistanceSitting_E p = new L849_MaxDistanceSitting_E();

        // L165_CompareVersionNumber_M p = new L165_CompareVersionNumber_M();
        // L402_RemoveKDigits_M p = new L402_RemoveKDigits_M();

        //CutTheSticks c = new CutTheSticks();
        //LongestIncreasingSequence l = new LongestIncreasingSequence();

        // SteppingNumber n = new SteppingNumber();

        // ColorfulNumber p = new ColorfulNumber();

    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

//    CurrentMain p = new CurrentMain();
//        p.foo();
    private void foo() {
        System.out.println("do nothing");
    }


    private static void hashTest() {
        HashSet<common.data.types.TreeNode> set = new HashSet<>();
        TreeNode r = new common.data.types.TreeNode(1);
        common.data.types.TreeNode first = r;
        set.add(first);

        common.data.types.TreeNode second =r;
        // point third to first
        common.data.types.TreeNode third = first;

        if (set.contains(first)) {
            System.out.print("Check: the first pointer is in set");
        }
        if (set.contains(second)) {
            System.out.print("second pointer's pointed value is there");
        }
        // check whether first is equivalent to second
        if(first == second) {
            System.out.print("pointer equivalnet?");
        }

        if (first.hashCode() == second.hashCode()) {
            System.out.print("hash code equivalent");
        }
    }
}
