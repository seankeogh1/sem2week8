public class Calculator {
        public int add(int firstNum, int secondNum){

            long result = (long) firstNum + secondNum;
            if(result > Integer.MAX_VALUE)
            {
                throw new IllegalArgumentException("This value was too big");
            }
            return (int) result;
        }
}
