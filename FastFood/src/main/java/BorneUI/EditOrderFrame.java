package BorneUI;
import order.*;

public class EditOrderFrame extends javax.swing.JPanel {
    private SelectProductsFrame selectProductsFrame;
    private SelectMenusFrame selectMenusFrame;
    private OrderResumeFrame orderResumeFrame;
    private OrderManager order;
    private MainBorneUI main;
    
    /**
     * Creates new form EditOrderFrame
     */
    public EditOrderFrame(OrderManager order, MainBorneUI main, OrderListManager orderListManager) {
        this.main = main;
        this.order = order;
        this.selectProductsFrame = new SelectProductsFrame(this.order);
        this.selectMenusFrame = new SelectMenusFrame(this.order);
        this.orderResumeFrame = new OrderResumeFrame(this.order, this.main, orderListManager);
        initComponents();
        this.showSelectProductsFrame();
    }
    
    public void showSelectMenusFrame() {
        this.removeAll();
        this.add(this.selectMenusFrame);
        this.add(this.orderResumeFrame);
    }
    
    public void showSelectProductsFrame() {
        this.removeAll();
        this.add(this.selectProductsFrame);
        this.add(this.orderResumeFrame);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setLayout(new java.awt.GridLayout(1, 2));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
