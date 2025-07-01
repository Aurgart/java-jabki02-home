public class Main {
    public static void main(String[] args) {
        // вычислим площадь круга
        System.out.println(circleSquare(0, 0, 10));
        // цельсий в фаренгейты
        System.out.println(celsiusToFaren(27.2));
        // а что длиннее?
        System.out.println(compareLen("War"));
        // а февраль длинный?
        System.out.println(isLeapYear(2028));
        // а не жирдяй ли я ?
        System.out.println(IMTCalc(94.2, 1.94));

        // задание 6
        // таблица истинности для оператора &&
        System.out.println("A | B | A && B" );
        System.out.println("0 | 0 | 0");
        System.out.println("1 | 0 | 0");
        System.out.println("0 | 1 | 0");
        System.out.println("1 | 1 | 1");
        // таблица истинности для оператора ||
        System.out.println("A | B | A || B" );
        System.out.println("0 | 0 | 0");
        System.out.println("1 | 0 | 1");
        System.out.println("0 | 1 | 1");
        System.out.println("1 | 1 | 1");
        // вывод квадрата Задание 7
        System.out.println("\u25A0");
        // вывод полого квадрата Задание 8
        System.out.println("\u25A1");
        // вывод ромба Задание 9
        System.out.println("\u2666");
        // смайлик Задание 10
        System.out.println("\u263a");

        // Тернарный задание 1
        System.out.println(checkNumTern(5));
        // Тернарный задание 2
        System.out.println(checkNum35(12));
        // for задание 4
        for (int i = 10; i>0; i--){
            System.out.print(i + " " + (i == 1 ? "\n":""));
        }
        // for задание 5
        int col = 0;
        for (int j = 1; j <= 50; j++){
            col = col+(j%2 ==0 ?1 : 0);
        }
        System.out.println("Кол-во четных чисел с 1 до 50: " + col);
        // while Задание 1
        int j = 100;
        while (j % 7 != 0){
            j++;
        }
        System.out.println("Ближайшее число к 100 делится на 7: " + j);

        // break & continue Задание 1
        for (int i = 1 ;i <=20; i++){
            if (i % 3 ==0){
                continue;
            }
            System.out.print(i + " " + (i == 20 ? "\n":""));
        }

        // Задание for 1 тест
        int[] evenNumbers = {1, 2, 3, 5, 6, 7, 12, 15};
        System.out.println(evenSum(evenNumbers));

    }
    /**
     *  Расчет площади круга задание 1.
     * Добавил тут проверку на if как 5 задание из if-else
     * @param radius - радиус круга
     * @param diameter - диаметр
     * @param  circle_len - длина окружности
     * */
    static double circleSquare(double radius, double diameter, double circle_len){
        double p =  3.14159;
        // Расчет зависит от переданных параметров
        if (radius > 0 ) {  // по радиусу
            return p * (radius* radius);
        } else if (diameter > 0) { // по диаметру
            return (p * ( diameter * diameter))/4;
        } else if (circle_len > 0) { // по длине окружности
            return (circle_len * circle_len)/ (4 * p);
        } else {
            System.out.println("Не корректно заданы параметры");
            return 0;
        }
        /*
         * При желании можно добавить сверку значений если параметры дают разную площадь
         * и возвращать массив с расчетом по параметрам.
         * */
    }
    /**
     * Цельсий в Фаренгейт задание 2
     * @param temp - температура в цельсиях
     */
    static double celsiusToFaren(double temp){
        return (temp * 9)/5+32;
    }
    /**
     * Сравнить длину слов задание 3
     * @param word  - слова которое сравниваем с hello
     */
    static boolean compareLen(String word){
        return word.length() == "Hello".length();
    }

    /**
     * Проверка високосный ли год задание 4
     * @param year - год в виде числа yyyy
     */
    static boolean isLeapYear(int year){
        return (year / 4) % 4 == 0;
    }

    /**
     * Расчет ИМТ по стандартной формуле.задание 5
     * @param weigth - вес
     * @param height - высота в метрах
     */
    static double IMTCalc(double weigth, double height){
        return weigth / (height * height);
    }

    /**
     * проверяет четность числа  задание if 1/тернарный 3
     * @param num - число
     * @param  is_tern - 0/1 - 0 через if/ 1 через тернарный оператор
     * @return - четное/нечетное
     */
    static String isEvenNumber(int num, int is_tern){
        if (is_tern == 1){
            return num % 2== 0 ?"Четное":"Нечетное";
        }
        // заодно сравнить что проще написать.
        if (num % 2 ==0 ){
            return "четное";
        } else {
            return "нечетное";
        }
    }

    /**
     * Сравнивает два числа Задание if 2
     * @param num1
     * @param num2
     * @return возвращает какое число больше, или они равны
     */
    static String compareNums(int num1, int num2){
        if (num1 > num2) {
            return "Первое больше";
        } else if (num1 < num2){
            return "Второе больше";
        } else {
            return "Равны";
        }
    }

    /**
     * Проверяет какое число Задание if 3
     * @param num
     * @return положительное/отрицательное/ноль(вообще это тоже положительное, но то такое)
     */
    static String checkNum(int num){
        if (num == 0 ) {
            return "Равно нулю";
        } else {
            if (num > 0){
                return "Положительное";
            } else {
                return "Отрицательное";
            }
        }
    }

    /**
     * проверяет возраст человека Задание if 4
     * @param age
     * @return может купить пивка, или пусть валит
     */
    static String checkAge(int age){
        if (age >= 18){
            return "Доступ разрешен";
        } else {
            return "Мелкий засранец";
        }
    }
    //Тернарный оператор

    /**
     * Проверка положительное отрицательное или нулевое Задание Тернарный 1
     * @param num
     * @return
     */
    static String checkNumTern(int num){
        return (num < 0 ? "отрицательное": (num > 0 ?"положительное":"нулевое"));
    }

    /**
     * Проверка делится ли число на 5 и 3 одновременно Задание Тернарны1 2
     * @param num
     * @return
     */
    static String checkNum35(int num){
        return (num % 5 == 0 && num % 3 ==0 ) ? "Кратно":"Не кратно";
    }

    //switch (не Нинтендо( )

    /**
     *  Возвращает день недели Задание switch 1
     * @param day
     * @return - название дня недели
     */
    static String dayOfWeek(int day){
        // можно без break так как return сразу заканчивает выполнение метода
        switch (day) {
            case 1: return "Понедельник";
            case 2: return "Вторник";
            case 3: return "Среда";
            case 4: return "Четверг";
            case 5: return "Пятница";
            case 6: return "Суббота";
            case 7: return "Воскресенье";
            default: return "Ошибка день многоват";
        }
    }
    /**
     * Возвращает оценку по работе Задание switch 2
     * @param mark
     * @return - оценка работы
     */
    static String resultOfWork(int mark){
        // break чисто для примера.
        String descript;
        switch (mark) {
            case 1: descript ="полный провал"; break;
            case 2: descript ="провал поменьше"; break;
            case 3: descript ="чето слабо";break;
            case 4: descript ="не мой уровень";break;
            case 5: descript ="Проходной бал";break;
            default: return "Многовато";
        }
        return "Чтобы вы не выбрали,  оценка отлично";
    }

    // for
    /**
     * возвращает сумму целых чисел из массива/списка Задание For 1
     * @param numbers - массив int
     * @return - сумма четных чисел
     */
    static int evenSum(int[] numbers){
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum +(numbers[i]%2 ==0? numbers[i]: 0);
        }
        return sum;
    }
    /**
     * Примитивный поиск максимума Задание for 2
     * @param numbers - массив чисел
     * @return - максимальное
     */
    static int findMax(int[] numbers){
        int max  = numbers[0];
        for (int i = 1; i < numbers.length; i++){
            max = max > numbers[i] ? max : numbers[i];
        }
        return max;
    }
    /**
     * таблица перемножения числа Задание for 3
     * @param num - число целое
     */
    static void multTable(int num){
        for (int i = 1; i <= 10; i++){
            System.out.println(num+" * "+i+ " = "+ num*i);
        }
    }

    /**
     * получение факториала числа Задание While 2
     * @param num - целое число.
     * @return - факториал
     */
    static int factorial(int num){
        int fact = num;
        while(num > 0){
            fact = fact * num;
            num--;
        }
        return  fact;
    }

    /**
     *  проверка что число простое, очень примитивная, и может быть затратной,
     *  разумнее это делать через решение уравнений, но там будут свои нюансы.
     *  Задание While 3
     * @param num - целое число
     * @return возвращает простое или нет
     */
    static boolean checkIfNumI0sSimple(int num){
        int i = 2;
        if (num <= 1){return true;}
        while (i < num * num) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * сумма до первого отрицательного числа.
     * Задание break 2/ Задание while 4
     * заодно как задача на while)
     * @param arr
     * @return
     */
    static int summNoNeg(int[] arr){
        int sum = 0;
        int i = 0;
        while (i < arr.length) {
            if (arr[i] < 0) {
                break;
            }
            sum = sum + arr[i];
            i++;
        }
        return sum;
    }

    /**
     * суммируем пока меньше 100
     * Задание break 3
     * @param arr
     * @return
     */
    static int sum100(int[] arr){
        int sum = 0;
        int j = 0;
        while(j < arr.length){
            if (sum + arr[j] > 100) {
                break;
            } else {
                sum = sum + arr[j];
            }
        }
        return sum;
    }
}