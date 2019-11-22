package pt.ulusofona.lp2.fandeisiaGame;

import java.lang.Object;
import static org.junit.Assert.*;

public class Test {

    public void TestPosições(){
        FandeisiaGameManager gameManager = new FandeisiaGameManager();
        String[] conteudoMundo = new String[3];
        conteudoMundo[0] = "id: 1, type: creature, teamId: 0, x: 0, y: 0, orientation: Norte";
        conteudoMundo[1] = "id: 2, type: creature, teamId: 1, x: 1, y: 1, orientation: Sul";
        conteudoMundo[2] = "id: -1, type: treasure, x: 2, y: 2";
        gameManager.startGame(conteudoMundo, 3, 3);
// ver se as criaturas e o tesouro estão nos sítios esperados no arranque:
        assertEquals(1, gameManager.getElementId(0, 0));
        assertEquals(2, gameManager.getElementId(1, 1));
        assertEquals(-1, gameManager.getElementId(2, 2));
// processar 1 turno
        gameManager.processTurn();
// ver se as criaturas e o tesouro estão nos sítios esperados depois do primeiro turno
        assertEquals(1, gameManager.getElementId(0, 0));  // continua no mesmo sítio
        assertEquals(0, gameManager.getElementId(1, 1));  // ficou vazio (o ID=2 moveu para 1,2)
        assertEquals(2, gameManager.getElementId(1, 2));
        assertEquals(-1, gameManager.getElementId(2, 2));  // não foi apanhado
    }
    public void TestOrientacao(){
        FandeisiaGameManager gameManager = new FandeisiaGameManager();
        String[] conteudoMundo = new String[3];
        conteudoMundo[0] = "id: 1, type: creature, teamId: 0, x: 0, y: 0, orientation: Norte";
        conteudoMundo[1] = "id: 2, type: creature, teamId: 1, x: 1, y: 1, orientation: Sul";
        conteudoMundo[2] = "id: -1, type: treasure, x: 2, y: 2";
        gameManager.startGame(conteudoMundo, 3, 3);
// ver se as criaturas e o tesouro estão nos sítios esperados no arranque:
        assertEquals(1, gameManager.getElementId(0, 0));
        assertEquals(2, gameManager.getElementId(1, 1));
        assertEquals(-1, gameManager.getElementId(2, 2));
// processar 1 turno
        gameManager.processTurn();
// ver se as criaturas e o tesouro estão nos sítios esperados depois do primeiro turno
        assertEquals(1, gameManager.getElementId(0, 0));  // continua no mesmo sítio
        assertEquals(0, gameManager.getElementId(1, 1));  // ficou vazio (o ID=2 moveu para 1,2)
        assertEquals(2, gameManager.getElementId(1, 2));
        assertEquals(-1, gameManager.getElementId(2, 2));  // não foi apanhado
    }
}