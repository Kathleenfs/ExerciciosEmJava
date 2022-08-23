
public class AulaTime {
	
	private int hora;
	private int min;
	private int seg;
	
	public AulaTime(int hora, int min, int seg){
		this.hora= hora;
		this.min = min;
		this.seg = seg;	
		
	}
	
	public AulaTime(int hora, int min){
		this.hora= hora;
		this.min = min;
		this.seg = 0;	
		
	}
	
	public AulaTime(int hora){
		this.hora= hora;
		this.min = 0;
		this.seg = 0;	
		
	}
	
	public void setTime(int hora, int min, int seg) {
		this.hora = hora;
		this.min = min;
		this.seg = seg;
	}
	
	public void setTime(int hora, int min) {
		this.hora = hora;
		this.min = min;
		this.seg = 0;
	}
	
	public void setTime(int hora) {
		this.hora = hora;
		this.min = 0;
		this.seg = 0;
	}
	
	public String exibirHoraUniversal() {
		return fmtNum(hora) + ":" + fmtNum(this.min)+ ":"+fmtNum(this.seg);
	}
	
	public String exibirHoraPadrao() {
		
		String sufixo;
		String horaPadrao;
		if(hora == 0) {
			horaPadrao = "12";
			sufixo = "AM";
		}
		else if(hora == 12) {
			horaPadrao = "12";
			sufixo = "PM";
		}
		else if(hora > 0 && hora < 12) {
			horaPadrao = String.valueOf(fmtNum(hora));
			sufixo = "AM";
		}
		else {
			horaPadrao = String.valueOf(fmtNum(hora-12));
			sufixo = "PM";
		}
		return horaPadrao + ":" + fmtNum(this.min)+":"+ fmtNum(this.seg)+sufixo;
	}
	private String fmtNum(int num) {
		if(num<10) {
			return "0" + num;
			}
			return String.valueOf(num);
	}
	
	
	
	
	

}
