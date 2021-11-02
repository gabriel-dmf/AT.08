package Item;

public class CD extends Midia {

	private int faixa;
	private String artista;
	private String album;
	
	public CD(int codigo, String descricao, String gravadora, float duracao, int faixa, String artista, String album) {
		super(codigo, descricao, gravadora, duracao);
		setFaixa(faixa);
		setArtista(artista);
		setAlbum(album);
	}
	
	public CD() {
		
	}
	
	public int getFaixa() {
		return faixa;
	}
	public void setFaixa(int faixa) {
		if(faixa > 0)
			this.faixa = faixa;
	}
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		if(artista.length() > 0)
			this.artista = artista;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		if(album.length() > 0)
			this.album = album;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CD [faixa=");
		builder.append(faixa);
		builder.append(", artista=");
		builder.append(artista);
		builder.append(", album=");
		builder.append(album);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
}