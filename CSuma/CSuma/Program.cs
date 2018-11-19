using System;

namespace CSuma
{
    class MainClass
    {
        public static void Main(string[] args)
        {
            decimal primerNumero = readDecimal("Primer número: ");
            decimal segundoNumero = readDecimal("Segundo número: ");

            Console.Write("Suma = " + (primerNumero + segundoNumero));

            /*Console.Write("Primer número: ");
            string stringPrimerNumero = Console.ReadLine();
            int primerNumero = int.Parse(stringPrimerNumero);

            Console.Write("Segundo número: ");
            string stringSegundoNumero = Console.ReadLine();
            decimal segundoNumero = decimal.Parse(stringSegundoNumero);

            Console.Write("Suma = " + (primerNumero + segundoNumero));*/
        }

        public static decimal readDecimal(string label){
            Console.Write(label);
            string stringDecimal = Console.ReadLine();
            return decimal.Parse(stringDecimal);
        }

    }
}
