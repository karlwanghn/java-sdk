package org.fisco.bcos.sdk.abi.datatypes.generated;

import java.util.List;
import org.fisco.bcos.sdk.abi.datatypes.StaticArray;
import org.fisco.bcos.sdk.abi.datatypes.Type;

/**
 * Auto generated code.
 *
 * <p><strong>Do not modifiy!</strong>
 *
 * <p>Please use AbiTypesGenerator in the <a
 * href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 */
public class StaticArray5<T extends Type> extends StaticArray<T> {
    public StaticArray5(List<T> values) {
        super(5, values);
    }

    @SafeVarargs
    public StaticArray5(T... values) {
        super(5, values);
    }
}
