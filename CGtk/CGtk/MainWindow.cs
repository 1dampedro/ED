using System;
using Gtk;

public partial class MainWindow : Gtk.Window
{
    public MainWindow() : base(Gtk.WindowType.Toplevel)
    {
        Build();
        buttonAceptar.Clicked += delegate {
            String nombre = entryNombre.Text;
            labelHola.Text = "Hola " + nombre;
            Console.WriteLine("Hecho click en buttonAceptar con nombre " + nombre);
        };
    }

    protected void OnDeleteEvent(object sender, DeleteEventArgs a)
    {
        Application.Quit();
        a.RetVal = true;
    }
}
