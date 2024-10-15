package solution;

public class ResourceAllocator
{
    public int allocate(ResourceInterface resource)
    {
        return resource.allocate();
    }

    public void free(ResourceInterface resource, int resourceId)
    {
        resource.free(resourceId);
    }
}

