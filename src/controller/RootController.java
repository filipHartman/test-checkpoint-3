package controller;


import dao.DaoBook;
import dao.DaoBookSql;
import view.View;

public class RootController {
    View view = new View();
    public void run() {
        view.showMenu();
        String option = view.getUserInput("Choose option: ");
        switch(option){
            case "5":
                DaoBook bookDao = new DaoBookSql();
                bookDao.getAllBooks();


        }

    }
}
