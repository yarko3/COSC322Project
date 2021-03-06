package AmazonBoard;

import EvaluationFunctions.MullerTegosEvaluation;

/**
 * A move datatype
 *
 * @author Yarko Senyuta
 */
public class GameMove {
    Position initialQ;
    Position FinalQ;
    Position arrow;

    public GameMove(Position initialQ,
                    Position finalQ, Position arrow) {
        super();
        this.initialQ = initialQ;
        FinalQ = finalQ;
        this.arrow = arrow;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((FinalQ == null) ? 0 : FinalQ.hashCode());
        result = prime * result + ((arrow == null) ? 0 : arrow.hashCode());
        result = prime * result
                + ((initialQ == null) ? 0 : initialQ.hashCode());
        return result;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "GameMove [initialQ=" + initialQ + ", FinalQ=" + FinalQ + ", arrow="
                + arrow + "]";
    }

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        GameMove other = (GameMove) obj;
        if (FinalQ == null) {
            if (other.FinalQ != null)
                return false;
        } else if (!FinalQ.equals(other.FinalQ))
            return false;
        if (arrow == null) {
            if (other.arrow != null)
                return false;
        } else if (!arrow.equals(other.arrow))
            return false;
        if (initialQ == null) {
            if (other.initialQ != null)
                return false;
        } else if (!initialQ.equals(other.initialQ))
            return false;
        return true;
    }

    /**
     * @return the initialQ
     */
    public Position getInitialQ() {
        return initialQ;
    }

    /**
     * @param initialQ the initialQ to set
     */
    public void setInitialQ(Position initialQ) {
        this.initialQ = initialQ;
    }

    /**
     * @return the finalQ
     */
    public Position getFinalQ() {
        return FinalQ;
    }

    /**
     * @param finalQ the finalQ to set
     */
    public void setFinalQ(Position finalQ) {
        FinalQ = finalQ;
    }

    /**
     * @return the arrow
     */
    public Position getArrow() {
        return arrow;
    }

    /**
     * @param arrow the arrow to set
     */
    public void setArrow(Position arrow) {
        this.arrow = arrow;
    }

    public void moveInfo(GameBoard gameBoard) {
        System.out.println("Move made: " + this);

        MullerTegosEvaluation.evaluateBoard(gameBoard, 1, false);

        System.out.println("Current evaluation: " + MullerTegosEvaluation.evaluateBoard(gameBoard, 1, false)[0] + "\t" + MullerTegosEvaluation.evaluateBoard(gameBoard, 1, false)[1]);
        System.out.println(gameBoard);
    }
}
