package cn.jump.kademlia.transport;

import cn.jump.kademlia.routing.Node;
import lombok.Getter;

import java.io.DataOutputStream;

/**
 * @author JumpTian
 */
@Getter
public class FindNodeMsg implements Msg {

    private Node originNode;
    private Node.Id lookupId;

    public FindNodeMsg(Node originNode, Node.Id lookupId) {
        this.originNode = originNode;
        this.lookupId = lookupId;
    }

    @Override
    public byte getType() {
        return 0;
    }

    @Override
    public void writeToStream(DataOutputStream out) {

    }
}
