package Easy;

public class ValidPerfectSquare {
    public boolean isPerfectSquare(int num) {
        int left = 1, right = num;
        while(left <= right){
            int mid = (left + right) / 2;
            if (mid == num / mid && num % mid == 0) return true;
            if (mid > num / mid ) right = mid - 1;
            else left = mid + 1;
        }
        return false;
    }
}
