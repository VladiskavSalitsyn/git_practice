public class Main {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        boolean r = a > b;

        String rest = (r == true) ? "a" : "b";
        System.out.printf(rest);
    }
}
/* предварительно создал Git репозиторий на Удаленном сервере GitHub
(https://github.com/VladiskavSalitsyn/git_practice.git)
*/
// через терминал в среде разработки, командой (git init) создал Git репозиторий
// добавил в проект класс Main и закоммитил его, с помощью "Зеленой галочки" с именем "commit 1"
// добавил метод main и закомиттил с именем "commit 2"
// добавил переменную int a = 3; закоммитил с именем "commit 3"
// добавил переменную int b = 4; закоммитил с именем "commit 4"
// добавил переменную int b = 4; закоммитил с именем "commit 5"
// отправил на GitHub и сравнил закоммичеснные версии с помошью  команды (git diff 'имя раннего файла' 'имя позднего файла'