public class EvenDigit {
    public static void main(String[] args) {
        int [] arr = {123,43,7654,9876,765};
        int result = 0;
        for (int i = 0; i<arr.length; i++){
            if(isEven(arr[i])){
                result += 1;
            }
        } 
        System.out.println("Number of even digits: "+result);  
    }
    static boolean isEven(int num){
        int count=0;
        while(num>0){
            count++;
            num /= 10;
        }
        return count % 2 == 0;-
    }
}
