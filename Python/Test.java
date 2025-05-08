// import java.util.Arrays;

// public class Test {

//     public boolean containsDuplicate(int[] nums) {
//         boolean result = false;

//         Arrays.sort(nums);

//         for(int i=0; i<nums.length - 1; i++)
//         {
//             if (nums[i] == nums[i+1])
//             {
//                 return result = true;
//             }
//         }

//         return result;
//     }

//     public static void main(String[] args) {
//         Test test = new Test();
        
//         int[] arr = {1,45,112,44,2,53,1222,42,12,13};
//         // Arrays.sort(arr);
//         // for(int i: arr)
//         // {
//         //     System.out.println(i);
//         // }
//         System.out.println(test.containsDuplicate(arr));
//     }
// }

public class Test {
    String name;

     public Test(String name) {
        this.name = name;
     }

     static void arrayMethod() {
        int[] num = new int[5];
        num[0] = 1;
        num[1] = 2;
        num[2] = 3;
        num[3] = 4;
        num[4] = 5;

        for(int each: num) {
            if (each == 3)
            System.out.println(each);
        }
     }
}

class ChildTest extends Test {
   int age;
   ChildTest(String name, int age)
   {
      super(name);
      this.age = age;
   }
}