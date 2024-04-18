/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAA;

/**
 *
 * @author Kashish
 */
public class exp7 {
    public static void main(String[] args) {
      
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the string to be repeated: ");
        String s = in.next();
        System.out.print("enter the number of characters to be considered: ");
        long n = in.nextLong();
        long num = n/s.length();
        long rem = n%s.length();
        long ans = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='a') {
                ans += num;
                if (i < rem)
                    ans++;
            }
        }
        System.out.println(ans);
    }
    
}
