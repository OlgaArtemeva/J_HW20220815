//Реализуйте программу, которая считает стоимость покупки, учитывая НДС. Т.е. дана стоимость товара и размер НДС (например, 19%) Ваша программа должна рассчитать, сколько, сколько вы должны оплатить, учитывая налог.

public class Main {
    public static void main(String[] args) {

        double costBuy = 78.00;
        double taxBuy = 19.00;
        double fullBuy = costBuy + (costBuy * taxBuy * 0.01);

        System.out.println("Итоговая стоимость покупки за " + costBuy + " рублей с налогом в размере " + (taxBuy) + "% составляет " + fullBuy + " рублей");
    }
}