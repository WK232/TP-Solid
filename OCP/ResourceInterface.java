package solution;

public interface ResourceInterface {
    int allocate();

    void free(int resourceId);
}
