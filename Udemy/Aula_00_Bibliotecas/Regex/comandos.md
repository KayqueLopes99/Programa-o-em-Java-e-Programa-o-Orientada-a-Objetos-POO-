## Principais comandos da biblioteca Regex

- A biblioteca de expressões regulares (Regex) em Java é usada para buscar, validar e manipular padrões em textos. Aqui estão os 10 principais comandos e exemplos práticos, incluindo validação de e-mail e telefone:


1. **Pattern.matches(String regex, String input)**
    - Verifica rapidamente se o texto corresponde ao padrão.
    ```java
    boolean valido = Pattern.matches("\\d{4}-\\d{2}-\\d{2}", "2024-06-01");
    ```

2. **split(String regex)**
    - Divide uma string usando uma expressão regular.
    ```java
    String[] partes = "a,b;c".split("[,;]");
    ```

3. **Validação de E-mail**
    - Expressão regular para validar e-mails.
    ```java
    public static boolean validarEmail(String email) {
        return email.matches("^[\\w](\\.?[\\w-])*@(gmail|hotmail)\\.com(\\.br)?$");
    }
    ```

4. **Validação de Telefone**
     - Expressão regular para validar telefones (exemplo brasileiro).
    ```java
    public static String lerTelefone() {

        while (true) {
            String telefone = leitor.nextLine().trim().replaceAll("[^0-9]", "");

            if ((telefone.length() == 10 || telefone.length() == 11) && telefone.matches("[0-9]+")) {
                return telefone;
            }

            System.out.print("Número inválido. Digite um telefone com 10 ou 11 dígitos (apenas números): ");
        }
    }
    ```
