package com.example.consumingrest;
import com.fasterxml.jackson.annotation.JsonProperty;

// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString), Root.class); */
public class Rates{
    @JsonProperty("USD") 
    public int getUSD() { 
		 return this.uSD; } 
    public void setUSD(int uSD) { 
		 this.uSD = uSD; } 
    int uSD;
    @JsonProperty("AED") 
    public double getAED() { 
		 return this.aED; } 
    public void setAED(double aED) { 
		 this.aED = aED; } 
    double aED;
    @JsonProperty("AFN") 
    public double getAFN() { 
		 return this.aFN; } 
    public void setAFN(double aFN) { 
		 this.aFN = aFN; } 
    double aFN;
    @JsonProperty("ALL") 
    public double getALL() { 
		 return this.aLL; } 
    public void setALL(double aLL) { 
		 this.aLL = aLL; } 
    double aLL;
    @JsonProperty("AMD") 
    public double getAMD() { 
		 return this.aMD; } 
    public void setAMD(double aMD) { 
		 this.aMD = aMD; } 
    double aMD;
    @JsonProperty("ANG") 
    public double getANG() { 
		 return this.aNG; } 
    public void setANG(double aNG) { 
		 this.aNG = aNG; } 
    double aNG;
    @JsonProperty("AOA") 
    public double getAOA() { 
		 return this.aOA; } 
    public void setAOA(double aOA) { 
		 this.aOA = aOA; } 
    double aOA;
    @JsonProperty("ARS") 
    public double getARS() { 
		 return this.aRS; } 
    public void setARS(double aRS) { 
		 this.aRS = aRS; } 
    double aRS;
    @JsonProperty("AUD") 
    public double getAUD() { 
		 return this.aUD; } 
    public void setAUD(double aUD) { 
		 this.aUD = aUD; } 
    double aUD;
    @JsonProperty("AWG") 
    public double getAWG() { 
		 return this.aWG; } 
    public void setAWG(double aWG) { 
		 this.aWG = aWG; } 
    double aWG;
    @JsonProperty("AZN") 
    public double getAZN() { 
		 return this.aZN; } 
    public void setAZN(double aZN) { 
		 this.aZN = aZN; } 
    double aZN;
    @JsonProperty("BAM") 
    public double getBAM() { 
		 return this.bAM; } 
    public void setBAM(double bAM) { 
		 this.bAM = bAM; } 
    double bAM;
    @JsonProperty("BBD") 
    public int getBBD() { 
		 return this.bBD; } 
    public void setBBD(int bBD) { 
		 this.bBD = bBD; } 
    int bBD;
    @JsonProperty("BDT") 
    public double getBDT() { 
		 return this.bDT; } 
    public void setBDT(double bDT) { 
		 this.bDT = bDT; } 
    double bDT;
    @JsonProperty("BGN") 
    public double getBGN() { 
		 return this.bGN; } 
    public void setBGN(double bGN) { 
		 this.bGN = bGN; } 
    double bGN;
    @JsonProperty("BHD") 
    public double getBHD() { 
		 return this.bHD; } 
    public void setBHD(double bHD) { 
		 this.bHD = bHD; } 
    double bHD;
    @JsonProperty("BIF") 
    public double getBIF() { 
		 return this.bIF; } 
    public void setBIF(double bIF) { 
		 this.bIF = bIF; } 
    double bIF;
    @JsonProperty("BMD") 
    public int getBMD() { 
		 return this.bMD; } 
    public void setBMD(int bMD) { 
		 this.bMD = bMD; } 
    int bMD;
    @JsonProperty("BND") 
    public double getBND() { 
		 return this.bND; } 
    public void setBND(double bND) { 
		 this.bND = bND; } 
    double bND;
    @JsonProperty("BOB") 
    public double getBOB() { 
		 return this.bOB; } 
    public void setBOB(double bOB) { 
		 this.bOB = bOB; } 
    double bOB;
    @JsonProperty("BRL") 
    public double getBRL() { 
		 return this.bRL; } 
    public void setBRL(double bRL) { 
		 this.bRL = bRL; } 
    double bRL;
    @JsonProperty("BSD") 
    public int getBSD() { 
		 return this.bSD; } 
    public void setBSD(int bSD) { 
		 this.bSD = bSD; } 
    int bSD;
    @JsonProperty("BTN") 
    public double getBTN() { 
		 return this.bTN; } 
    public void setBTN(double bTN) { 
		 this.bTN = bTN; } 
    double bTN;
    @JsonProperty("BWP") 
    public double getBWP() { 
		 return this.bWP; } 
    public void setBWP(double bWP) { 
		 this.bWP = bWP; } 
    double bWP;
    @JsonProperty("BYN") 
    public double getBYN() { 
		 return this.bYN; } 
    public void setBYN(double bYN) { 
		 this.bYN = bYN; } 
    double bYN;
    @JsonProperty("BZD") 
    public int getBZD() { 
		 return this.bZD; } 
    public void setBZD(int bZD) { 
		 this.bZD = bZD; } 
    int bZD;
    @JsonProperty("CAD") 
    public double getCAD() { 
		 return this.cAD; } 
    public void setCAD(double cAD) { 
		 this.cAD = cAD; } 
    double cAD;
    @JsonProperty("CDF") 
    public double getCDF() { 
		 return this.cDF; } 
    public void setCDF(double cDF) { 
		 this.cDF = cDF; } 
    double cDF;
    @JsonProperty("CHF") 
    public double getCHF() { 
		 return this.cHF; } 
    public void setCHF(double cHF) { 
		 this.cHF = cHF; } 
    double cHF;
    @JsonProperty("CLP") 
    public double getCLP() { 
		 return this.cLP; } 
    public void setCLP(double cLP) { 
		 this.cLP = cLP; } 
    double cLP;
    @JsonProperty("CNY") 
    public double getCNY() { 
		 return this.cNY; } 
    public void setCNY(double cNY) { 
		 this.cNY = cNY; } 
    double cNY;
    @JsonProperty("COP") 
    public double getCOP() { 
		 return this.cOP; } 
    public void setCOP(double cOP) { 
		 this.cOP = cOP; } 
    double cOP;
    @JsonProperty("CRC") 
    public double getCRC() { 
		 return this.cRC; } 
    public void setCRC(double cRC) { 
		 this.cRC = cRC; } 
    double cRC;
    @JsonProperty("CUC") 
    public int getCUC() { 
		 return this.cUC; } 
    public void setCUC(int cUC) { 
		 this.cUC = cUC; } 
    int cUC;
    @JsonProperty("CUP") 
    public double getCUP() { 
		 return this.cUP; } 
    public void setCUP(double cUP) { 
		 this.cUP = cUP; } 
    double cUP;
    @JsonProperty("CVE") 
    public double getCVE() { 
		 return this.cVE; } 
    public void setCVE(double cVE) { 
		 this.cVE = cVE; } 
    double cVE;
    @JsonProperty("CZK") 
    public int getCZK() { 
		 return this.cZK; } 
    public void setCZK(int cZK) { 
		 this.cZK = cZK; } 
    int cZK;
    @JsonProperty("DJF") 
    public double getDJF() { 
		 return this.dJF; } 
    public void setDJF(double dJF) { 
		 this.dJF = dJF; } 
    double dJF;
    @JsonProperty("DKK") 
    public double getDKK() { 
		 return this.dKK; } 
    public void setDKK(double dKK) { 
		 this.dKK = dKK; } 
    double dKK;
    @JsonProperty("DOP") 
    public double getDOP() { 
		 return this.dOP; } 
    public void setDOP(double dOP) { 
		 this.dOP = dOP; } 
    double dOP;
    @JsonProperty("DZD") 
    public double getDZD() { 
		 return this.dZD; } 
    public void setDZD(double dZD) { 
		 this.dZD = dZD; } 
    double dZD;
    @JsonProperty("EGP") 
    public double getEGP() { 
		 return this.eGP; } 
    public void setEGP(double eGP) { 
		 this.eGP = eGP; } 
    double eGP;
    @JsonProperty("ERN") 
    public int getERN() { 
		 return this.eRN; } 
    public void setERN(int eRN) { 
		 this.eRN = eRN; } 
    int eRN;
    @JsonProperty("ETB") 
    public double getETB() { 
		 return this.eTB; } 
    public void setETB(double eTB) { 
		 this.eTB = eTB; } 
    double eTB;
    @JsonProperty("EUR") 
    public double getEUR() { 
		 return this.eUR; } 
    public void setEUR(double eUR) { 
		 this.eUR = eUR; } 
    double eUR;
    @JsonProperty("FJD") 
    public double getFJD() { 
		 return this.fJD; } 
    public void setFJD(double fJD) { 
		 this.fJD = fJD; } 
    double fJD;
    @JsonProperty("FKP") 
    public double getFKP() { 
		 return this.fKP; } 
    public void setFKP(double fKP) { 
		 this.fKP = fKP; } 
    double fKP;
    @JsonProperty("FOK") 
    public double getFOK() { 
		 return this.fOK; } 
    public void setFOK(double fOK) { 
		 this.fOK = fOK; } 
    double fOK;
    @JsonProperty("GBP") 
    public double getGBP() { 
		 return this.gBP; } 
    public void setGBP(double gBP) { 
		 this.gBP = gBP; } 
    double gBP;
    @JsonProperty("GEL") 
    public double getGEL() { 
		 return this.gEL; } 
    public void setGEL(double gEL) { 
		 this.gEL = gEL; } 
    double gEL;
    @JsonProperty("GGP") 
    public double getGGP() { 
		 return this.gGP; } 
    public void setGGP(double gGP) { 
		 this.gGP = gGP; } 
    double gGP;
    @JsonProperty("GHS") 
    public double getGHS() { 
		 return this.gHS; } 
    public void setGHS(double gHS) { 
		 this.gHS = gHS; } 
    double gHS;
    @JsonProperty("GIP") 
    public double getGIP() { 
		 return this.gIP; } 
    public void setGIP(double gIP) { 
		 this.gIP = gIP; } 
    double gIP;
    @JsonProperty("GMD") 
    public double getGMD() { 
		 return this.gMD; } 
    public void setGMD(double gMD) { 
		 this.gMD = gMD; } 
    double gMD;
    @JsonProperty("GNF") 
    public double getGNF() { 
		 return this.gNF; } 
    public void setGNF(double gNF) { 
		 this.gNF = gNF; } 
    double gNF;
    @JsonProperty("GTQ") 
    public double getGTQ() { 
		 return this.gTQ; } 
    public void setGTQ(double gTQ) { 
		 this.gTQ = gTQ; } 
    double gTQ;
    @JsonProperty("GYD") 
    public double getGYD() { 
		 return this.gYD; } 
    public void setGYD(double gYD) { 
		 this.gYD = gYD; } 
    double gYD;
    @JsonProperty("HKD") 
    public double getHKD() { 
		 return this.hKD; } 
    public void setHKD(double hKD) { 
		 this.hKD = hKD; } 
    double hKD;
    @JsonProperty("HNL") 
    public double getHNL() { 
		 return this.hNL; } 
    public void setHNL(double hNL) { 
		 this.hNL = hNL; } 
    double hNL;
    @JsonProperty("HRK") 
    public double getHRK() { 
		 return this.hRK; } 
    public void setHRK(double hRK) { 
		 this.hRK = hRK; } 
    double hRK;
    @JsonProperty("HTG") 
    public double getHTG() { 
		 return this.hTG; } 
    public void setHTG(double hTG) { 
		 this.hTG = hTG; } 
    double hTG;
    @JsonProperty("HUF") 
    public double getHUF() { 
		 return this.hUF; } 
    public void setHUF(double hUF) { 
		 this.hUF = hUF; } 
    double hUF;
    @JsonProperty("IDR") 
    public double getIDR() { 
		 return this.iDR; } 
    public void setIDR(double iDR) { 
		 this.iDR = iDR; } 
    double iDR;
    @JsonProperty("ILS") 
    public double getILS() { 
		 return this.iLS; } 
    public void setILS(double iLS) { 
		 this.iLS = iLS; } 
    double iLS;
    @JsonProperty("IMP") 
    public double getIMP() { 
		 return this.iMP; } 
    public void setIMP(double iMP) { 
		 this.iMP = iMP; } 
    double iMP;
    @JsonProperty("INR") 
    public double getINR() { 
		 return this.iNR; } 
    public void setINR(double iNR) { 
		 this.iNR = iNR; } 
    double iNR;
    @JsonProperty("IQD") 
    public double getIQD() { 
		 return this.iQD; } 
    public void setIQD(double iQD) { 
		 this.iQD = iQD; } 
    double iQD;
    @JsonProperty("IRR") 
    public double getIRR() { 
		 return this.iRR; } 
    public void setIRR(double iRR) { 
		 this.iRR = iRR; } 
    double iRR;
    @JsonProperty("ISK") 
    public double getISK() { 
		 return this.iSK; } 
    public void setISK(double iSK) { 
		 this.iSK = iSK; } 
    double iSK;
    @JsonProperty("JMD") 
    public double getJMD() { 
		 return this.jMD; } 
    public void setJMD(double jMD) { 
		 this.jMD = jMD; } 
    double jMD;
    @JsonProperty("JOD") 
    public double getJOD() { 
		 return this.jOD; } 
    public void setJOD(double jOD) { 
		 this.jOD = jOD; } 
    double jOD;
    @JsonProperty("JPY") 
    public double getJPY() { 
		 return this.jPY; } 
    public void setJPY(double jPY) { 
		 this.jPY = jPY; } 
    double jPY;
    @JsonProperty("KES") 
    public double getKES() { 
		 return this.kES; } 
    public void setKES(double kES) { 
		 this.kES = kES; } 
    double kES;
    @JsonProperty("KGS") 
    public double getKGS() { 
		 return this.kGS; } 
    public void setKGS(double kGS) { 
		 this.kGS = kGS; } 
    double kGS;
    @JsonProperty("KHR") 
    public double getKHR() { 
		 return this.kHR; } 
    public void setKHR(double kHR) { 
		 this.kHR = kHR; } 
    double kHR;
    @JsonProperty("KID") 
    public double getKID() { 
		 return this.kID; } 
    public void setKID(double kID) { 
		 this.kID = kID; } 
    double kID;
    @JsonProperty("KMF") 
    public double getKMF() { 
		 return this.kMF; } 
    public void setKMF(double kMF) { 
		 this.kMF = kMF; } 
    double kMF;
    @JsonProperty("KRW") 
    public double getKRW() { 
		 return this.kRW; } 
    public void setKRW(double kRW) { 
		 this.kRW = kRW; } 
    double kRW;
    @JsonProperty("KWD") 
    public double getKWD() { 
		 return this.kWD; } 
    public void setKWD(double kWD) { 
		 this.kWD = kWD; } 
    double kWD;
    @JsonProperty("KYD") 
    public double getKYD() { 
		 return this.kYD; } 
    public void setKYD(double kYD) { 
		 this.kYD = kYD; } 
    double kYD;
    @JsonProperty("KZT") 
    public double getKZT() { 
		 return this.kZT; } 
    public void setKZT(double kZT) { 
		 this.kZT = kZT; } 
    double kZT;
    @JsonProperty("LAK") 
    public double getLAK() { 
		 return this.lAK; } 
    public void setLAK(double lAK) { 
		 this.lAK = lAK; } 
    double lAK;
    @JsonProperty("LBP") 
    public double getLBP() { 
		 return this.lBP; } 
    public void setLBP(double lBP) { 
		 this.lBP = lBP; } 
    double lBP;
    @JsonProperty("LKR") 
    public double getLKR() { 
		 return this.lKR; } 
    public void setLKR(double lKR) { 
		 this.lKR = lKR; } 
    double lKR;
    @JsonProperty("LRD") 
    public double getLRD() { 
		 return this.lRD; } 
    public void setLRD(double lRD) { 
		 this.lRD = lRD; } 
    double lRD;
    @JsonProperty("LSL") 
    public double getLSL() { 
		 return this.lSL; } 
    public void setLSL(double lSL) { 
		 this.lSL = lSL; } 
    double lSL;
    @JsonProperty("LYD") 
    public double getLYD() { 
		 return this.lYD; } 
    public void setLYD(double lYD) { 
		 this.lYD = lYD; } 
    double lYD;
    @JsonProperty("MAD") 
    public double getMAD() { 
		 return this.mAD; } 
    public void setMAD(double mAD) { 
		 this.mAD = mAD; } 
    double mAD;
    @JsonProperty("MDL") 
    public double getMDL() { 
		 return this.mDL; } 
    public void setMDL(double mDL) { 
		 this.mDL = mDL; } 
    double mDL;
    @JsonProperty("MGA") 
    public double getMGA() { 
		 return this.mGA; } 
    public void setMGA(double mGA) { 
		 this.mGA = mGA; } 
    double mGA;
    @JsonProperty("MKD") 
    public double getMKD() { 
		 return this.mKD; } 
    public void setMKD(double mKD) { 
		 this.mKD = mKD; } 
    double mKD;
    @JsonProperty("MMK") 
    public double getMMK() { 
		 return this.mMK; } 
    public void setMMK(double mMK) { 
		 this.mMK = mMK; } 
    double mMK;
    @JsonProperty("MNT") 
    public double getMNT() { 
		 return this.mNT; } 
    public void setMNT(double mNT) { 
		 this.mNT = mNT; } 
    double mNT;
    @JsonProperty("MOP") 
    public double getMOP() { 
		 return this.mOP; } 
    public void setMOP(double mOP) { 
		 this.mOP = mOP; } 
    double mOP;
    @JsonProperty("MRU") 
    public double getMRU() { 
		 return this.mRU; } 
    public void setMRU(double mRU) { 
		 this.mRU = mRU; } 
    double mRU;
    @JsonProperty("MUR") 
    public double getMUR() { 
		 return this.mUR; } 
    public void setMUR(double mUR) { 
		 this.mUR = mUR; } 
    double mUR;
    @JsonProperty("MVR") 
    public double getMVR() { 
		 return this.mVR; } 
    public void setMVR(double mVR) { 
		 this.mVR = mVR; } 
    double mVR;
    @JsonProperty("MWK") 
    public double getMWK() { 
		 return this.mWK; } 
    public void setMWK(double mWK) { 
		 this.mWK = mWK; } 
    double mWK;
    @JsonProperty("MXN") 
    public double getMXN() { 
		 return this.mXN; } 
    public void setMXN(double mXN) { 
		 this.mXN = mXN; } 
    double mXN;
    @JsonProperty("MYR") 
    public double getMYR() { 
		 return this.mYR; } 
    public void setMYR(double mYR) { 
		 this.mYR = mYR; } 
    double mYR;
    @JsonProperty("MZN") 
    public double getMZN() { 
		 return this.mZN; } 
    public void setMZN(double mZN) { 
		 this.mZN = mZN; } 
    double mZN;
    @JsonProperty("NAD") 
    public double getNAD() { 
		 return this.nAD; } 
    public void setNAD(double nAD) { 
		 this.nAD = nAD; } 
    double nAD;
    @JsonProperty("NGN") 
    public double getNGN() { 
		 return this.nGN; } 
    public void setNGN(double nGN) { 
		 this.nGN = nGN; } 
    double nGN;
    @JsonProperty("NIO") 
    public double getNIO() { 
		 return this.nIO; } 
    public void setNIO(double nIO) { 
		 this.nIO = nIO; } 
    double nIO;
    @JsonProperty("NOK") 
    public double getNOK() { 
		 return this.nOK; } 
    public void setNOK(double nOK) { 
		 this.nOK = nOK; } 
    double nOK;
    @JsonProperty("NPR") 
    public double getNPR() { 
		 return this.nPR; } 
    public void setNPR(double nPR) { 
		 this.nPR = nPR; } 
    double nPR;
    @JsonProperty("NZD") 
    public double getNZD() { 
		 return this.nZD; } 
    public void setNZD(double nZD) { 
		 this.nZD = nZD; } 
    double nZD;
    @JsonProperty("OMR") 
    public double getOMR() { 
		 return this.oMR; } 
    public void setOMR(double oMR) { 
		 this.oMR = oMR; } 
    double oMR;
    @JsonProperty("PAB") 
    public int getPAB() { 
		 return this.pAB; } 
    public void setPAB(int pAB) { 
		 this.pAB = pAB; } 
    int pAB;
    @JsonProperty("PEN") 
    public double getPEN() { 
		 return this.pEN; } 
    public void setPEN(double pEN) { 
		 this.pEN = pEN; } 
    double pEN;
    @JsonProperty("PGK") 
    public double getPGK() { 
		 return this.pGK; } 
    public void setPGK(double pGK) { 
		 this.pGK = pGK; } 
    double pGK;
    @JsonProperty("PHP") 
    public double getPHP() { 
		 return this.pHP; } 
    public void setPHP(double pHP) { 
		 this.pHP = pHP; } 
    double pHP;
    @JsonProperty("PKR") 
    public double getPKR() { 
		 return this.pKR; } 
    public void setPKR(double pKR) { 
		 this.pKR = pKR; } 
    double pKR;
    @JsonProperty("PLN") 
    public double getPLN() { 
		 return this.pLN; } 
    public void setPLN(double pLN) { 
		 this.pLN = pLN; } 
    double pLN;
    @JsonProperty("PYG") 
    public double getPYG() { 
		 return this.pYG; } 
    public void setPYG(double pYG) { 
		 this.pYG = pYG; } 
    double pYG;
    @JsonProperty("QAR") 
    public double getQAR() { 
		 return this.qAR; } 
    public void setQAR(double qAR) { 
		 this.qAR = qAR; } 
    double qAR;
    @JsonProperty("RON") 
    public double getRON() { 
		 return this.rON; } 
    public void setRON(double rON) { 
		 this.rON = rON; } 
    double rON;
    @JsonProperty("RSD") 
    public double getRSD() { 
		 return this.rSD; } 
    public void setRSD(double rSD) { 
		 this.rSD = rSD; } 
    double rSD;
    @JsonProperty("RUB") 
    public double getRUB() { 
		 return this.rUB; } 
    public void setRUB(double rUB) { 
		 this.rUB = rUB; } 
    double rUB;
    @JsonProperty("RWF") 
    public double getRWF() { 
		 return this.rWF; } 
    public void setRWF(double rWF) { 
		 this.rWF = rWF; } 
    double rWF;
    @JsonProperty("SAR") 
    public double getSAR() { 
		 return this.sAR; } 
    public void setSAR(double sAR) { 
		 this.sAR = sAR; } 
    double sAR;
    @JsonProperty("SBD") 
    public double getSBD() { 
		 return this.sBD; } 
    public void setSBD(double sBD) { 
		 this.sBD = sBD; } 
    double sBD;
    @JsonProperty("SCR") 
    public double getSCR() { 
		 return this.sCR; } 
    public void setSCR(double sCR) { 
		 this.sCR = sCR; } 
    double sCR;
    @JsonProperty("SDG") 
    public double getSDG() { 
		 return this.sDG; } 
    public void setSDG(double sDG) { 
		 this.sDG = sDG; } 
    double sDG;
    @JsonProperty("SEK") 
    public double getSEK() { 
		 return this.sEK; } 
    public void setSEK(double sEK) { 
		 this.sEK = sEK; } 
    double sEK;
    @JsonProperty("SGD") 
    public double getSGD() { 
		 return this.sGD; } 
    public void setSGD(double sGD) { 
		 this.sGD = sGD; } 
    double sGD;
    @JsonProperty("SHP") 
    public double getSHP() { 
		 return this.sHP; } 
    public void setSHP(double sHP) { 
		 this.sHP = sHP; } 
    double sHP;
    @JsonProperty("SLL") 
    public double getSLL() { 
		 return this.sLL; } 
    public void setSLL(double sLL) { 
		 this.sLL = sLL; } 
    double sLL;
    @JsonProperty("SOS") 
    public double getSOS() { 
		 return this.sOS; } 
    public void setSOS(double sOS) { 
		 this.sOS = sOS; } 
    double sOS;
    @JsonProperty("SRD") 
    public double getSRD() { 
		 return this.sRD; } 
    public void setSRD(double sRD) { 
		 this.sRD = sRD; } 
    double sRD;
    @JsonProperty("SSP") 
    public double getSSP() { 
		 return this.sSP; } 
    public void setSSP(double sSP) { 
		 this.sSP = sSP; } 
    double sSP;
    @JsonProperty("STN") 
    public double getSTN() { 
		 return this.sTN; } 
    public void setSTN(double sTN) { 
		 this.sTN = sTN; } 
    double sTN;
    @JsonProperty("SYP") 
    public double getSYP() { 
		 return this.sYP; } 
    public void setSYP(double sYP) { 
		 this.sYP = sYP; } 
    double sYP;
    @JsonProperty("SZL") 
    public double getSZL() { 
		 return this.sZL; } 
    public void setSZL(double sZL) { 
		 this.sZL = sZL; } 
    double sZL;
    @JsonProperty("THB") 
    public double getTHB() { 
		 return this.tHB; } 
    public void setTHB(double tHB) { 
		 this.tHB = tHB; } 
    double tHB;
    @JsonProperty("TJS") 
    public double getTJS() { 
		 return this.tJS; } 
    public void setTJS(double tJS) { 
		 this.tJS = tJS; } 
    double tJS;
    @JsonProperty("TMT") 
    public double getTMT() { 
		 return this.tMT; } 
    public void setTMT(double tMT) { 
		 this.tMT = tMT; } 
    double tMT;
    @JsonProperty("TND") 
    public double getTND() { 
		 return this.tND; } 
    public void setTND(double tND) { 
		 this.tND = tND; } 
    double tND;
    @JsonProperty("TOP") 
    public double getTOP() { 
		 return this.tOP; } 
    public void setTOP(double tOP) { 
		 this.tOP = tOP; } 
    double tOP;
    @JsonProperty("TRY") 
    public double getTRY() { 
		 return this.tRY; } 
    public void setTRY(double tRY) { 
		 this.tRY = tRY; } 
    double tRY;
    @JsonProperty("TTD") 
    public double getTTD() { 
		 return this.tTD; } 
    public void setTTD(double tTD) { 
		 this.tTD = tTD; } 
    double tTD;
    @JsonProperty("TVD") 
    public double getTVD() { 
		 return this.tVD; } 
    public void setTVD(double tVD) { 
		 this.tVD = tVD; } 
    double tVD;
    @JsonProperty("TWD") 
    public double getTWD() { 
		 return this.tWD; } 
    public void setTWD(double tWD) { 
		 this.tWD = tWD; } 
    double tWD;
    @JsonProperty("TZS") 
    public double getTZS() { 
		 return this.tZS; } 
    public void setTZS(double tZS) { 
		 this.tZS = tZS; } 
    double tZS;
    @JsonProperty("UAH") 
    public double getUAH() { 
		 return this.uAH; } 
    public void setUAH(double uAH) { 
		 this.uAH = uAH; } 
    double uAH;
    @JsonProperty("UGX") 
    public double getUGX() { 
		 return this.uGX; } 
    public void setUGX(double uGX) { 
		 this.uGX = uGX; } 
    double uGX;
    @JsonProperty("UYU") 
    public double getUYU() { 
		 return this.uYU; } 
    public void setUYU(double uYU) { 
		 this.uYU = uYU; } 
    double uYU;
    @JsonProperty("UZS") 
    public double getUZS() { 
		 return this.uZS; } 
    public void setUZS(double uZS) { 
		 this.uZS = uZS; } 
    double uZS;
    @JsonProperty("VES") 
    public double getVES() { 
		 return this.vES; } 
    public void setVES(double vES) { 
		 this.vES = vES; } 
    double vES;
    @JsonProperty("VND") 
    public double getVND() { 
		 return this.vND; } 
    public void setVND(double vND) { 
		 this.vND = vND; } 
    double vND;
    @JsonProperty("VUV") 
    public double getVUV() { 
		 return this.vUV; } 
    public void setVUV(double vUV) { 
		 this.vUV = vUV; } 
    double vUV;
    @JsonProperty("WST") 
    public double getWST() { 
		 return this.wST; } 
    public void setWST(double wST) { 
		 this.wST = wST; } 
    double wST;
    @JsonProperty("XAF") 
    public double getXAF() { 
		 return this.xAF; } 
    public void setXAF(double xAF) { 
		 this.xAF = xAF; } 
    double xAF;
    @JsonProperty("XCD") 
    public double getXCD() { 
		 return this.xCD; } 
    public void setXCD(double xCD) { 
		 this.xCD = xCD; } 
    double xCD;
    @JsonProperty("XDR") 
    public double getXDR() { 
		 return this.xDR; } 
    public void setXDR(double xDR) { 
		 this.xDR = xDR; } 
    double xDR;
    @JsonProperty("XOF") 
    public double getXOF() { 
		 return this.xOF; } 
    public void setXOF(double xOF) { 
		 this.xOF = xOF; } 
    double xOF;
    @JsonProperty("XPF") 
    public double getXPF() { 
		 return this.xPF; } 
    public void setXPF(double xPF) { 
		 this.xPF = xPF; } 
    double xPF;
    @JsonProperty("YER") 
    public double getYER() { 
		 return this.yER; } 
    public void setYER(double yER) { 
		 this.yER = yER; } 
    double yER;
    @JsonProperty("ZAR") 
    public double getZAR() { 
		 return this.zAR; } 
    public void setZAR(double zAR) { 
		 this.zAR = zAR; } 
    double zAR;
    @JsonProperty("ZMW") 
    public double getZMW() { 
		 return this.zMW; } 
    public void setZMW(double zMW) { 
		 this.zMW = zMW; } 
    double zMW;
}

