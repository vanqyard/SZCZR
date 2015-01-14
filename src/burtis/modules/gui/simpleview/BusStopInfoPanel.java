package burtis.modules.gui.simpleview;

import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import burtis.common.mockups.MockupPassenger;

class BusStopInfoPanel extends JPanel
{
    private static final long serialVersionUID = 1L;
    private JTable table;
    private JLabel title = new JLabel();
    // private JLabel busStop = new JLabel();
    String[] columnNames = { "Id", "Depot", "Destination" };
    Object[][] data = new Object[30][3];

    public BusStopInfoPanel()
    {
        setLayout(new BorderLayout());
        add(title, BorderLayout.PAGE_START);
        table = new JTable(data, columnNames);
        table.setEnabled(false);
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);
    }

    public void setCurrentBusStop(String s)
    {
        title.setText("Bus Stop Name: " + s);
    }

    public void setCurrentBus(Integer i)
    {
        title.setText("Bus Id: " + i.toString());
    }

    public void setCurrentBusStop(String s,
            ArrayList<MockupPassenger> passengerList)
    {
        title.setText("Bus Stop Name: " + s);
        int count = 0;
        if (passengerList == null)
            System.out.println("passengerList is null");
        for (MockupPassenger mp : passengerList)
        {
            table.setValueAt(mp.getId(), count, 0);
            table.setValueAt(mp.getDepot(), count, 1);
            table.setValueAt(mp.getDestination(), count, 2);
            count++;
        }
    }

    public void setCurrentBus(Integer i,
            ArrayList<MockupPassenger> passengerList)
    {
        title.setText("Bus Id: " + i.toString());
        int count = 0;
        if (passengerList == null)
            System.out.println("passengerList is null");
        for (MockupPassenger mp : passengerList)
        {
            table.setValueAt(mp.getId(), count, 0);
            table.setValueAt(mp.getDepot(), count, 1);
            table.setValueAt(mp.getDestination(), count, 2);
            count++;
        }
    }
}
