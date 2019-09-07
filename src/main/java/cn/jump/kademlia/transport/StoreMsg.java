package cn.jump.kademlia.transport;

import cn.jump.kademlia.dht.Record;
import cn.jump.kademlia.routing.Node;
import lombok.Getter;

import java.io.DataOutputStream;

/**
 * @author JumpTian
 */
@Getter
public class StoreMsg implements Msg {

    private Node originNode;
    private Record record;

    public StoreMsg(Node originNode, Record record) {
        this.originNode = originNode;
        this.record = record;
    }

    @Override
    public byte getType() {
        return 0;
    }

    @Override
    public void writeToStream(DataOutputStream out) {

    }
}