using System;
using Gtk;
using System.Collections.Generic;
using CGtk;

public partial class MainWindow : Gtk.Window
{
    private static readonly Gdk.Color COLOR_CIAN = new Gdk.Color(0, 255, 180);
    public MainWindow() : base(Gtk.WindowType.Toplevel)
    {
        Build();
        Panel panel = new Panel(vbox1);
        Bombo bombo = new Bombo();

        buttonAdelante.Clicked += delegate
        {
            int numero = bombo.sacarBola();
            panel.Marcar(numero);
            if (!bombo.quedanBolas())
                buttonAdelante.Sensitive = false;
            Console.WriteLine("buttonAdelante pulsado");
        };


        //Button[] buttons = new Button[90];//
       /* List<Button> buttons = new List<Button>();

        int num = 1;
        for (int row = 0; row < 9; row++)
        {
            for (int column = 0; column < 10; column++)
            {
                Button button = new Button();
                button.Label = num++.ToString();
                table.Attach(button, (uint)column, (uint)column + 1, (uint)row, (uint)row + 1);
                buttons.Add(button);
            }
        }

        table.ShowAll();

        Random random = new Random();
        buttonAdelante.Clicked += delegate
        {
            int numeroAleatorio = random.Next(90) + 1;
            labelNumero.Text = numeroAleatorio.ToString();
            buttons[numeroAleatorio - 1].ModifyBg(StateType.Normal, COLOR_CIAN);
        };*/
    }
    protected void OnDeleteEvent(object sender, DeleteEventArgs a)
    {
        Application.Quit();
        a.RetVal = true;
    }

}
