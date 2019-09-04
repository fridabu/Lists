import java.util.ArrayList;
import java.util.List;

// Java class to find union, intersection of
// two or more sorted arrays
public class UnionLists {

        /* Function union and finds intersection of arr1[] and arr2[]
        m is the number of elements in arr1[]
        n is the number of elements in arr2[] */
        static TwoListsResults unionAndIntersection(int arr1[], int arr2[])
        {
            List<Integer> union = new ArrayList<>();
            List<Integer> intersection = new ArrayList<>();
            int m = arr1.length;
            int n = arr2.length;

            int i = 0, j = 0;
            while (i < m && j < n)
            {
                if (arr1[i] < arr2[j])
                    union.add(arr1[i++]);
                else if (arr2[j] < arr1[i])
                    union.add(arr2[j++]);
                else
                {
                    union.add(arr2[j]);
                    intersection.add(arr2[j]);
                    j++;
                    i++;
                }
            }

         /* Add remaining elements of
         the larger array */
            while(i < m)
                union.add(arr1[i++]);
            while(j < n)
                union.add(arr2[j++]);

            TwoListsResults results = new TwoListsResults();
            results.setUnion(union);
            results.setIntersection(intersection);
            return results;
        }

        public static class TwoListsResults{
            private List<Integer> union = new ArrayList<>();
            private List<Integer> intersection = new ArrayList<>();

            public List<Integer> getUnion() {
                return union;
            }

            public List<Integer> getIntersection() {
                return intersection;
            }

            public void setUnion(List<Integer> union) {
                this.union = union;
            }

            public void setIntersection(List<Integer> intersection) {
                this.intersection = intersection;
            }
        }

}
