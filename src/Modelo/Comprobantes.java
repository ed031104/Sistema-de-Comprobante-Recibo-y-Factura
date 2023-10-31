package Modelo;

/*@author Oscar Fonseca*/

public class Comprobantes {
    //comprobantes de pago
    
    //datos de facturas
    private int codigo;
    private String Cuenta;
    private String parcial;
    private double Debe;
    private double haber;
    private double totaldebe;
    private double totalhaber;
    private double capital;
    
    //datos del vendedor
    
    private String Recibidopor;
    private String Nºcedulacomprobantepago;
    private String elaboradopor;
    private String revisado;
    private String autorizado;
    private String fechacomprobantepago;
    
    //comporbante de caja chica
    
    private String lugar;//municipio
    private String fechacaja;//fecha de la transaccion
    private String paguesea;//persona a quien se le pagara
    private double Cantidad$;
    private String Cifra;//cantidad a pagar en letras
    private String Concepto;//motivo del pago
    private String pagadopor;//persona que esta pagando
    private String recibidopor;//persona que recive el pago
    private String nºcedulacajachica;
    
    //comprobante de diario
    
    private String codigodiario;
    private String nombrecuentadiario;
    private String Parcialdiario;
    private double debediario;
    private double haberdiario;
    private double totaldebediario;
    private double totalhaberdiario;
    private String elaboradodiario;
    private String revisadodiario;
    private String autorizadodiario;

    //comprobante de pago (datos de calculo)
    public Comprobantes(int codigo, String Cuenta, String parcial, double Debe, double haber, double totaldebe, double totalhaber, double capital) {
        this.codigo = codigo;
        this.Cuenta = Cuenta;
        this.parcial = parcial;
        this.Debe = Debe;
        this.haber = haber;
        this.totaldebe = totaldebe;
        this.totalhaber = totalhaber;
        this.capital = capital;
    }
    //comprobante de pago(datos del vendedor)
    public Comprobantes(String Recibidopor, String Nºcedula, String revisado, String autorizado, String fecha) {
        this.Recibidopor = Recibidopor;
        this.Nºcedulacomprobantepago = Nºcedula;
        this.revisado = revisado;
        this.autorizado = autorizado;
        this.fechacomprobantepago = fecha;
    }

    //comprobante de caja chica
    public Comprobantes(String lugar, String fechacaja, String paguesea, double Cantidad$, String Cifra, String Concepto, String pagadopor, String recibidopor, String nºcedulacajachica) {
        this.lugar = lugar;
        this.fechacaja = fechacaja;
        this.paguesea = paguesea;
        this.Cantidad$ = Cantidad$;
        this.Cifra = Cifra;
        this.Concepto = Concepto;
        this.pagadopor = pagadopor;
        this.recibidopor = recibidopor;
        this.nºcedulacajachica = nºcedulacajachica;
    }
    
    //comprobante de diario(datos de calculo)
    public Comprobantes(String codigodiario, String nombrecuentadiario, String Parcialdiario, double debediario, double haberdiario, double totaldebediario, double totalhaberdiario) {
        this.codigodiario = codigodiario;
        this.nombrecuentadiario = nombrecuentadiario;
        this.Parcialdiario = Parcialdiario;
        this.debediario = debediario;
        this.haberdiario = haberdiario;
        this.totaldebediario = totaldebediario;
        this.totalhaberdiario = totalhaberdiario;
    }

    //comprobante de diario (datos de administracion)
    public Comprobantes(String elaboradodiario, String revisadodiario, String autorizadodiario) {
        this.elaboradodiario = elaboradodiario;
        this.revisadodiario = revisadodiario;
        this.autorizadodiario = autorizadodiario;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCuenta() {
        return Cuenta;
    }

    public void setCuenta(String Cuenta) {
        this.Cuenta = Cuenta;
    }

    public String getParcial() {
        return parcial;
    }

    public void setParcial(String parcial) {
        this.parcial = parcial;
    }

    public double getDebe() {
        return Debe;
    }

    public void setDebe(double Debe) {
        this.Debe = Debe;
    }

    public double getHaber() {
        return haber;
    }

    public void setHaber(double haber) {
        this.haber = haber;
    }

    public double getTotaldebe() {
        return totaldebe;
    }

    public void setTotaldebe(double totaldebe) {
        this.totaldebe = totaldebe;
    }

    public double getTotalhaber() {
        return totalhaber;
    }

    public void setTotalhaber(double totalhaber) {
        this.totalhaber = totalhaber;
    }

    public double getCapital() {
        return capital;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }

    public String getRecibidopor() {
        return Recibidopor;
    }

    public void setRecibidopor(String Recibidopor) {
        this.Recibidopor = Recibidopor;
    }

    public String getNºcedulacomprobantepago() {
        return Nºcedulacomprobantepago;
    }

    public void setNºcedulacomprobantepago(String Nºcedulacomprobantepago) {
        this.Nºcedulacomprobantepago = Nºcedulacomprobantepago;
    }

    public String getElaboradopor() {
        return elaboradopor;
    }

    public void setElaboradopor(String elaboradopor) {
        this.elaboradopor = elaboradopor;
    }

    public String getRevisado() {
        return revisado;
    }

    public void setRevisado(String revisado) {
        this.revisado = revisado;
    }

    public String getAutorizado() {
        return autorizado;
    }

    public void setAutorizado(String autorizado) {
        this.autorizado = autorizado;
    }

    public String getFechacomprobantepago() {
        return fechacomprobantepago;
    }

    public void setFechacomprobantepago(String fechacomprobantepago) {
        this.fechacomprobantepago = fechacomprobantepago;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getFechacaja() {
        return fechacaja;
    }

    public void setFechacaja(String fechacaja) {
        this.fechacaja = fechacaja;
    }

    public String getPaguesea() {
        return paguesea;
    }

    public void setPaguesea(String paguesea) {
        this.paguesea = paguesea;
    }

    public double getCantidad$() {
        return Cantidad$;
    }

    public void setCantidad$(double Cantidad$) {
        this.Cantidad$ = Cantidad$;
    }

    public String getCifra() {
        return Cifra;
    }

    public void setCifra(String Cifra) {
        this.Cifra = Cifra;
    }

    public String getConcepto() {
        return Concepto;
    }

    public void setConcepto(String Concepto) {
        this.Concepto = Concepto;
    }

    public String getPagadopor() {
        return pagadopor;
    }

    public void setPagadopor(String pagadopor) {
        this.pagadopor = pagadopor;
    }

    public String getrecibidoporn() {
        return recibidopor;
    }

    public void setrecibidopor(String recibidopor) {
        this.recibidopor = recibidopor;
    }

    public String getNºcedulacajachica() {
        return nºcedulacajachica;
    }

    public void setNºcedulacajachica(String nºcedulacajachica) {
        this.nºcedulacajachica = nºcedulacajachica;
    }

    public String getCodigodiario() {
        return codigodiario;
    }

    public void setCodigodiario(String codigodiario) {
        this.codigodiario = codigodiario;
    }

    public String getNombrecuentadiario() {
        return nombrecuentadiario;
    }

    public void setNombrecuentadiario(String nombrecuentadiario) {
        this.nombrecuentadiario = nombrecuentadiario;
    }

    public String getParcialdiario() {
        return Parcialdiario;
    }

    public void setParcialdiario(String Parcialdiario) {
        this.Parcialdiario = Parcialdiario;
    }

    public double getDebediario() {
        return debediario;
    }

    public void setDebediario(double debediario) {
        this.debediario = debediario;
    }

    public double getHaberdiario() {
        return haberdiario;
    }

    public void setHaberdiario(double haberdiario) {
        this.haberdiario = haberdiario;
    }

    public double getTotaldebediario() {
        return totaldebediario;
    }

    public void setTotaldebediario(double totaldebediario) {
        this.totaldebediario = totaldebediario;
    }

    public double getTotalhaberdiario() {
        return totalhaberdiario;
    }

    public void setTotalhaberdiario(double totalhaberdiario) {
        this.totalhaberdiario = totalhaberdiario;
    }

    public String getElaboradodiario() {
        return elaboradodiario;
    }

    public void setElaboradodiario(String elaboradodiario) {
        this.elaboradodiario = elaboradodiario;
    }

    public String getRevisadodiario() {
        return revisadodiario;
    }

    public void setRevisadodiario(String revisadodiario) {
        this.revisadodiario = revisadodiario;
    }

    public String getAutorizadodiario() {
        return autorizadodiario;
    }

    public void setAutorizadodiario(String autorizadodiario) {
        this.autorizadodiario = autorizadodiario;
    }
    
    
}