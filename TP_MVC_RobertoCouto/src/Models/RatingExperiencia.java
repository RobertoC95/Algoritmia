package Models;

public class RatingExperiencia {
    private String idRating;
    private String idExp;
    private int ratingExp;
    private int ratingGuia;

    public RatingExperiencia(String idRating, String idExp, int ratingExp, int ratingGuia) {
        this.idRating = idRating;
        this.idExp = idExp;
        this.ratingExp = ratingExp;
        this.ratingGuia = ratingGuia;
    }

    public String getIdRating() {
        return idRating;
    }

    public String getIdExp() {
        return idExp;
    }

    public int getRatingExp() {
        return ratingExp;
    }

    public int getRatingGuia() {
        return ratingGuia;
    }
}
