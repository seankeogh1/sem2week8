public class Calculator {
        public int add(int firstNum, int secondNum){

            long result = (long) firstNum + secondNum;
            if(result > Integer.MAX_VALUE)
            {
                throw new IllegalArgumentException("This value was too big");
            }
            return (int) result;
        }
        public int subtract(int firstNum, int secondNum){
            long result = (long) firstNum - secondNum;
            if(result < Integer.MIN_VALUE){
                throw new IllegalArgumentException("This value was too Small");
            }
            return (int) result;
        }

        public int multiply(int firstNum, int secondNum){
            long result = (long) firstNum * secondNum;
            if(result > Integer.MAX_VALUE){
                throw new IllegalArgumentException("This value was too big");
            }
            return (int) result;
        }
        public int divide(int firstNum, int secondNum){
            long result = (long) firstNum / secondNum;
            if(result > Integer.MAX_VALUE){
                throw new IllegalArgumentException("This value was invalid");
            }
            return (int) result;
        }
}
