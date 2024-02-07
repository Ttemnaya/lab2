
    public class StringProcessor {

        // Метод repeatString повторяет строку s N раз и возвращает результат
        public static String repeatString(String s, int N) {
            if (N < 0) {
                throw new IllegalArgumentException("N must be non-negative.");
            }

            // Используем StringBuilder для эффективной работы со строками
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < N; i++) {
                result.append(s); // Добавляем строку s к результату N раз
            }

            return result.toString(); // Преобразуем StringBuilder в обычную строку
        }

        public static void main(String[] args) {
            String s = "Hello";
            int N = 3;

            System.out.println(repeatString(s, N)); // Выводим результат на экран
        }
        // )
    }


