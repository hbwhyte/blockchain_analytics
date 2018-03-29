package blockchain_analytics.model;

public class BlockchainResponse {

    String name;
    int height;
    String hash;
    String time;
    String latest_url;
    String previous_hash;
    String previous_url;
    int peer_count;
    int high_fee_per_kb;
    int medium_fee_per_kb;
    int low_fee_per_kb;
    int unconfirmed_count;
    int last_fork_height;
    String last_fork_hash;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getLatest_url() {
        return latest_url;
    }

    public void setLatest_url(String latest_url) {
        this.latest_url = latest_url;
    }

    public String getPrevious_hash() {
        return previous_hash;
    }

    public void setPrevious_hash(String previous_hash) {
        this.previous_hash = previous_hash;
    }

    public String getPrevious_url() {
        return previous_url;
    }

    public void setPrevious_url(String previous_url) {
        this.previous_url = previous_url;
    }

    public int getPeer_count() {
        return peer_count;
    }

    public void setPeer_count(int peer_count) {
        this.peer_count = peer_count;
    }

    public int getHigh_fee_per_kb() {
        return high_fee_per_kb;
    }

    public void setHigh_fee_per_kb(int high_fee_per_kb) {
        this.high_fee_per_kb = high_fee_per_kb;
    }

    public int getMedium_fee_per_kb() {
        return medium_fee_per_kb;
    }

    public void setMedium_fee_per_kb(int medium_fee_per_kb) {
        this.medium_fee_per_kb = medium_fee_per_kb;
    }

    public int getLow_fee_per_kb() {
        return low_fee_per_kb;
    }

    public void setLow_fee_per_kb(int low_fee_per_kb) {
        this.low_fee_per_kb = low_fee_per_kb;
    }

    public int getUnconfirmed_count() {
        return unconfirmed_count;
    }

    public void setUnconfirmed_count(int unconfirmed_count) {
        this.unconfirmed_count = unconfirmed_count;
    }

    public int getLast_fork_height() {
        return last_fork_height;
    }

    public void setLast_fork_height(int last_fork_height) {
        this.last_fork_height = last_fork_height;
    }

    public String getLast_fork_hash() {
        return last_fork_hash;
    }

    public void setLast_fork_hash(String last_fork_hash) {
        this.last_fork_hash = last_fork_hash;
    }
}
