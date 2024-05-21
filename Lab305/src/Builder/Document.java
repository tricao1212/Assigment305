/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Builder;

/**
 *
 * @author Acer pv
 */
public abstract class Document {
    private int Extension;
    private int Encryption;
    
    public Document(){
        
    }

    public void setExtension(int Extension) {
        this.Extension = Extension;
    }

    public void setEncryption(int Encryption) {
        this.Encryption = Encryption;
    }
    
}
