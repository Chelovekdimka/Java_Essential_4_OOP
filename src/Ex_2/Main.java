//Використовуючи IntelliJ IDEA, створіть проект. Потрібно: Створити клас AbstractHandler.
//        У тілі класу створити методи void open(), void create(), void change(), void save().
//        Створити похідні класи XMLHandler, TXTHandler, DOCHandler від базового класу AbstractHandler. Написати програму,
//        яка виконуватиме визначення документа і для кожного формату мають бути методи відкриття,
//        створення, редагування, збереження певного формату документа.

package Ex_2;

public class Main {
    public static void main(String[] args) {
    String documentType = "XML"; // тут можна змінити тип документа
    AbstractHandler handler;

        switch (documentType) {
        case "XML":
            handler = new XMLHandler();
            break;
        case "TXT":
            handler = new TXTHandler();
            break;
        case "DOC":
            handler = new DOCHandler();
            break;
        default:
            throw new IllegalArgumentException("Invalid document type: " + documentType);
        }

        handler.create();
        handler.open();
        handler.change();
        handler.save();
    }
}

