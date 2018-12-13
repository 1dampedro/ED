using System;
using Gtk;

public partial class MainWindow : Gtk.Window
{
    public MainWindow() : base(Gtk.WindowType.Toplevel)
    {
        Build();
        button1.Clicked += delegate
        {
            labelResultado.LabelProp = "1";
        };
        button2.Clicked += delegate
        {
            labelResultado.LabelProp = "2";
        };
        button3.Clicked += delegate
        {
            labelResultado.LabelProp = "3";
        };
        button4.Clicked += delegate
        {
            labelResultado.LabelProp = "4";
        };
    }
   
}
