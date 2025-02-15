/*
За основу берём код решения домашнего задания из предыдущего семинара и дорабатываем его.

— Создайте иерархию sealed классов, которые представляют собой команды. В корне иерархии интерфейс Command.
— В каждом классе иерархии должна быть функция isValid(): Boolean, которая возвращает true, если команда введена с корректными аргументами.
Проверку телефона и email нужно перенести в эту функцию.
— Напишите функцию readCommand(): Command, которая читает команду из текстового ввода,
распознаёт её и возвращает один из классов-наследников Command, соответствующий введённой команде.
— Создайте data класс Person, который представляет собой запись о человеке. Этот класс должен содержать поля:
name – имя человека
phone – номер телефона
email – адрес электронной почты
— Добавьте новую команду show, которая выводит последнее значение, введённой с помощью команды add.
Для этого значение должно быть сохранено в переменную типа Person. Если на момент выполнения команды show не было ничего введено,
нужно вывести на экран сообщение “Not initialized”.
— Функция main должна выглядеть следующем образом. Для каждой команды от пользователя:
Читаем команду с помощью функции readCommand
Выводим на экран получившийся экземпляр Command
Если isValid для команды возвращает false, выводим help. Если true, обрабатываем команду внутри when.
 */

sealed interface Command {
    class Exit() : Command {
        override fun isValid(): Boolean {
            return true
        }
    }

    class Help() : Command {
        override fun isValid(): Boolean {
            return true
        }
    }
    class AddPhone(var validValue: Boolean) : Command {
        override fun isValid(): Boolean {
            //validValue = true
            return validValue
        }
    }
    class AddEmail(var validValue: Boolean) : Command {
        override fun isValid(): Boolean {
            validValue = true
            return validValue
        }
    }

    class Show(var validValue: Boolean) : Command {
        override fun isValid(): Boolean {
            validValue = true
            return validValue
        }
    }
    class Find(var validValue: Boolean) : Command {
        override fun isValid(): Boolean {
            validValue = true
            return validValue
        }
    }

    fun isValid(): Boolean
}
