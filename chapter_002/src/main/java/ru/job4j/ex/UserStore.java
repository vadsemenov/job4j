package ru.job4j.ex;

/**
 * Работа с Exception
 */
public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User user = null;
        for (User us : users) {
            if (us.getUsername().equals(login)) {
                user = us;
            }
        }
        if (user == null) {
            throw new UserNotFoundException("Пользователь не найден.");
        }
        return user;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (user.getUsername().length() < 3 || !user.isValid()) {
            throw new UserInvalidException("Не валидный пользователь.");
        }
        return true;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Vadim Semenov", true)
        };

        try {
            User user = findUser(users, "Vadim Semenov");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException usIE) {
            usIE.printStackTrace();
        } catch (UserNotFoundException usNFE) {
            usNFE.printStackTrace();
        }
    }
}

/*
4. Вам необходимо реализовать метод findUser, validate и main.

findUser - если пользователя не нашли в списке, то кинуть исключение UserNotFoundException.

validate - если пользователь не валидный или если имя пользователя состоит из менее трех
символов, то кинуть исключение UserInvalidException

Метод validate принимает аргумент user. У объекта user есть метод isValid(). Если он false,
 то нужно выкинуть исключение UserInvalidException.
 */