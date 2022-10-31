package fr.ot.jsf1.metier;


public class Article
{

	private Integer id;
	private String libelle;
	private Integer volume;
	private Float titrage;
	private Float prixAchat;
	private int stock;
	private Marque marque;
	private Couleur couleur;
	private Type type;
	
	public Article()
	{
		couleur = new Couleur();
		type = new Type();
		marque = new Marque();
	}

	public Article(Integer id, String libelle)
	{
		this.id = id;
		this.libelle = libelle;
		couleur = new Couleur();
		type = new Type();
		marque = new Marque();
	}


	public Integer getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}


	public String getLibelle()
	{
		return libelle;
	}

	public void setLibelle(String libelle)
	{
		this.libelle = libelle;
	}


	public Integer getVolume()
	{
		return volume;
	}

	public void setVolume(Integer volume)
	{
		this.volume = volume;
	}


	public Float getTitrage()
	{
		return titrage;
	}

	public void setTitrage(Float titrage)
	{
		this.titrage = titrage;
	}

	public Couleur getCouleur()
	{
		return couleur;
	}

	public void setCouleur(Couleur couleur)
	{
		this.couleur = couleur;
	}

	public Marque getMarque()
	{
		return marque;
	}

	public void setMarque(Marque marque)
	{
		this.marque = marque;
	}

	public Float getPrixAchat()
	{
		return prixAchat;
	}

	public void setPrixAchat(Float prixAchat)
	{
		this.prixAchat = prixAchat;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}


	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}
}
