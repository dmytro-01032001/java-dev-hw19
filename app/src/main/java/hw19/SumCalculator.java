package hw19;

public class SumCalculator {
    public int sum(int n){
        if (!PositiveNumberValidator.isValidParameter(n)){
            throw new IllegalArgumentException("Параметр має бути більше нуля!");
        }
        int result = 0;
        for(int i = 0; i <= n; i++){
            result = result + i;
        }
        return result;
    }
}
