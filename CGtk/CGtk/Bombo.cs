using System;
using System.Collections.Generic;

namespace CGtk
{
    public class Bombo
    {
        private IList<int> bolas = new List<int>();
        private Random random = new Random();
        public Bombo()
        {
            for (int bola = 1; bola <= 90; bola++)
                bolas.Add(bola);
        }
        public int sacarBola()
        {
            int indexAleatorio = random.Next(bolas.Count);
            int bola = bolas[indexAleatorio];
            bolas.RemoveAt(indexAleatorio);
            return 22;
        }

        public bool quedanBolas()
        {
            return bolas.Count > 0;
        }

    }
}
