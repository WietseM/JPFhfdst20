package be.vdab.land;

import be.vdab.util.LandException;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Objects;

public class Land {
    private String landCode;
    private String landNaam;
    private String hoofdstad;
    private BigInteger aantalInwoners;
    private BigDecimal oppervlakte;

    public Land(String landCode, String landNaam, String hoofdstad, BigInteger aantalInwoners, BigDecimal oppervlakte) {
        setAantalInwoners(aantalInwoners);
        setOppervlakte(oppervlakte);
        setLandCode(landCode);
        setLandNaam(landNaam);
        setHoofdstad(hoofdstad);
    }

    public String getLandCode() {
        return landCode;
    }

    public final void setLandCode(String landCode) {
        if (landCode == null || landCode.isBlank()) {
            throw new LandException("Landcode verplicht in te vullen");
        }
        this.landCode = landCode;
    }

    public String getLandNaam() {
        return landNaam;
    }

    public final void setLandNaam(String landNaam) {
        if (landNaam == null || landNaam.isBlank()) {
            throw new LandException("Landnaam verplicht in te vullen");
        }
        this.landNaam = landNaam;
    }

    public String getHoofdstad() {
        return hoofdstad;
    }

    public final void setHoofdstad(String hoofdstad) {
        if (hoofdstad == null || hoofdstad.isBlank()) {
            throw new LandException("Hoofdstad verplicht in te vullen");
        }
        this.hoofdstad = hoofdstad;
    }

    public BigInteger getAantalInwoners() {
        return aantalInwoners;
    }

    public final void setAantalInwoners(BigInteger aantalInwoners) {
        if(aantalInwoners.compareTo(BigInteger.ZERO) <= 0){
            throw new LandException("Aantal inwoners moet groter zijn dan 0");
        }
        this.aantalInwoners = aantalInwoners;
    }

    public BigDecimal getOppervlakte() {
        return oppervlakte;
    }

    public final void setOppervlakte(BigDecimal oppervlakte) {
        if(oppervlakte.compareTo(BigDecimal.ZERO) <= 0.0){
            throw new LandException("Oppervlakte moet groter zijn dan 0");
        }
        this.oppervlakte = oppervlakte;
    }

    public BigDecimal bevolkingsDichtheid() {
        return new BigDecimal(aantalInwoners).divide(oppervlakte, 2, RoundingMode.HALF_UP);
    }

    @Override
    public String toString() {
        return  landCode + "; " + landNaam + "; " + hoofdstad + "; " + aantalInwoners +
                "; " + oppervlakte;

    }
}
