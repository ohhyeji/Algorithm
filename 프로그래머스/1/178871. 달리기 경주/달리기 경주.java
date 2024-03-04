import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> map = new HashMap<>();
        
        for(int i=0; i<players.length; i++){
            map.put(players[i], i);
        }
        
        for(String player : callings){
            int playerRanking = map.get(player);
            
            String frontPlayer = players[playerRanking-1];
            
            map.replace(frontPlayer, playerRanking);
            players[playerRanking] = frontPlayer;
            
            map.replace(player, playerRanking-1);
            players[playerRanking-1] = player;
        }
        
        return players;
    }
}