/* Please, do not rename it */
class Problem {

    public static void main(String[] args) {
        String operator = args[0];
        int result = 0;
        if(operator.equals("MIN")) {
            result = Integer.parseInt(args[1]);
        }

        for (int i = 1; i < args.length; i++) {
            int value = Integer.parseInt(args[i]);

            switch (operator) {
                case "MAX" :
                    if (value > result) {
                        result = value;
                    }
                    break;
                case "MIN" :
                    if (value < result) {
                        result = value;
                    }
                    break;
                case "SUM" :
                    result += value;
                    break;
            }
        }

        System.out.print(result);
    }
}