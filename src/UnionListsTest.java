import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;


class UnionListsTest {

    @org.junit.jupiter.api.Test
    void unionAndIntersectionPartialIntersection() {
        int arr1[] = {1, 2, 4, 5, 6};
        int arr2[] = {2, 3, 5, 7};

        UnionLists.TwoListsResults results = UnionLists.unionAndIntersection(arr1,arr2);

        UnionLists.TwoListsResults expectedResult = new UnionLists.TwoListsResults();
        List<Integer> union = new ArrayList<Integer>(){{
            add(1);
            add(2);
            add(3);
            add(4);
            add(5);
            add(6);
            add(7);
        }};

        List<Integer> intersection = new ArrayList<Integer>(){{
            add(2);
            add(5);
        }};

        expectedResult.setUnion(union);
        expectedResult.setIntersection(intersection);

        Assert.assertEquals(results.getUnion(),union);
        Assert.assertEquals(results.getIntersection(),intersection);
    }

    @org.junit.jupiter.api.Test
    void unionAndIntersectionNoIntersection() {
        int arr1[] = {1, 2, 4, 5, 6};
        int arr2[] = {3,7};

        UnionLists.TwoListsResults results = UnionLists.unionAndIntersection(arr1,arr2);

        UnionLists.TwoListsResults expectedResult = new UnionLists.TwoListsResults();
        List<Integer> union = new ArrayList<Integer>(){{
            add(1);
            add(2);
            add(3);
            add(4);
            add(5);
            add(6);
            add(7);
        }};

        List<Integer> intersection = new ArrayList<Integer>(){{
        }};

        expectedResult.setUnion(union);
        expectedResult.setIntersection(intersection);

        Assert.assertEquals(results.getUnion(),union);
        Assert.assertEquals(results.getIntersection(),intersection);
    }

    @org.junit.jupiter.api.Test
    void unionAndIntersectionFullIntersection() {
        int arr1[] = {1, 2, 3, 4, 5, 6, 7};
        int arr2[] = {1, 2, 3, 4, 5, 6, 7};

        UnionLists.TwoListsResults results = UnionLists.unionAndIntersection(arr1,arr2);

        UnionLists.TwoListsResults expectedResult = new UnionLists.TwoListsResults();
        List<Integer> union = new ArrayList<Integer>(){{
            add(1);
            add(2);
            add(3);
            add(4);
            add(5);
            add(6);
            add(7);
        }};

        List<Integer> intersection = new ArrayList<Integer>(){{
            add(1);
            add(2);
            add(3);
            add(4);
            add(5);
            add(6);
            add(7);
        }};

        expectedResult.setUnion(union);
        expectedResult.setIntersection(intersection);

        Assert.assertEquals(results.getUnion(),union);
        Assert.assertEquals(results.getIntersection(),intersection);
    }

    @org.junit.jupiter.api.Test
    void unionAndIntersectionFirstEmpty() {
        int arr1[] = {};
        int arr2[] = {1, 2, 3, 4, 5, 6, 7};

        UnionLists.TwoListsResults results = UnionLists.unionAndIntersection(arr1,arr2);

        UnionLists.TwoListsResults expectedResult = new UnionLists.TwoListsResults();
        List<Integer> union = new ArrayList<Integer>(){{
            add(1);
            add(2);
            add(3);
            add(4);
            add(5);
            add(6);
            add(7);
        }};

        List<Integer> intersection = new ArrayList<Integer>(){{
        }};

        expectedResult.setUnion(union);
        expectedResult.setIntersection(intersection);

        Assert.assertEquals(results.getUnion(),union);
        Assert.assertEquals(results.getIntersection(),intersection);
    }

    @org.junit.jupiter.api.Test
    void unionAndIntersectionSecondEmpty() {
        int arr1[] = {1, 2, 3, 4, 5, 6, 7};
        int arr2[] = {};

        UnionLists.TwoListsResults results = UnionLists.unionAndIntersection(arr1,arr2);

        UnionLists.TwoListsResults expectedResult = new UnionLists.TwoListsResults();
        List<Integer> union = new ArrayList<Integer>(){{
            add(1);
            add(2);
            add(3);
            add(4);
            add(5);
            add(6);
            add(7);
        }};

        List<Integer> intersection = new ArrayList<Integer>(){{
        }};

        expectedResult.setUnion(union);
        expectedResult.setIntersection(intersection);

        Assert.assertEquals(results.getUnion(),union);
        Assert.assertEquals(results.getIntersection(),intersection);
    }

    @org.junit.jupiter.api.Test
    void unionAndIntersectionTwoListsEmpty() {
        int arr1[] = {};
        int arr2[] = {};

        UnionLists.TwoListsResults results = UnionLists.unionAndIntersection(arr1,arr2);

        UnionLists.TwoListsResults expectedResult = new UnionLists.TwoListsResults();
        List<Integer> union = new ArrayList<Integer>(){{
        }};

        List<Integer> intersection = new ArrayList<Integer>(){{
        }};

        expectedResult.setUnion(union);
        expectedResult.setIntersection(intersection);

        Assert.assertEquals(results.getUnion(),union);
        Assert.assertEquals(results.getIntersection(),intersection);
    }


}