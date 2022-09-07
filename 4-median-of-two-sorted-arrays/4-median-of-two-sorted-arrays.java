class Solution {
//     public double findMedianSortedArrays(int[] nums1, int[] nums2) {
//         int size=nums1.length+nums2.length,i=0,mid=Integer.MAX_VALUE;
//         int ans[]=new int[size];
//         double result=0;
//         for(int data:nums1)
//             ans[i++]=data;
//         for(int data:nums2)
//             ans[i++]=data;

//           Arrays.sort(ans);

//         mid=size/2;
//         if(size%2 == 0){  
//             result=(ans[mid]+ans[mid-1])/2.0;
//             return result;
//         }
//         else{
//             result=ans[mid];
//             return result;
//         }
        
//     }
// }
 public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double median = 0;
        List<Integer> num1 = Arrays.stream(nums1).boxed().collect(Collectors.toList());
        List<Integer> num2 = Arrays.stream(nums2).boxed().collect(Collectors.toList());
        num1.addAll(num2);
        num1 = num1.stream().sorted((a,b) -> a.compareTo(b)).collect(Collectors.toList());
        if(num1.size()%2 ==0){
           int center = num1.size()/2;
           median = (num1.get(center)+num1.get(center-1));
           median/=2;
        }
        else
           return num1.size() ==1 ? num1.get(0) :num1.get(num1.size()/2);
        return median;
    }}