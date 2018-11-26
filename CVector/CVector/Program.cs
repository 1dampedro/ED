using System;

namespace CVector
{
    class Vector
    {
        public static void Main(string[] args)
        {
            Console.WriteLine("Hello World!");
            Array.ForEach(new int[] { 3, 5, 7 }, item => Console.Write("item=" + item));
        }

        public static int BinarySearch(int[] v, int x){
            int count = v.Length;
            if (count == 0)
                return -1;
            int left = 0;
            int right = count - 1;
            int middle = (right + left) / 2;
            while (left < right && v[middle] != x){
                if (...)
                    left = middle + 1;
                else
                    right = middle - 1;
                middle = (left + right) / 2;
            }
            return -2;
        }

    }
}
