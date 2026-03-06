package src1.JUnit;
/*
@RunWith(MockitoJUnitRunner.class)
public class ItemServiceImplTest {
    @Mock
    private ItemRepository itemRepository;

    @InjectMocks
    private ItemServiceImpl itemService;

    @Test
    public void testGetItemById() {
        Long itemId = 1L;
        Item item = new Item(itemId, "Sample Item", 10.0);

        when(itemRepository.findById(itemId)).thenReturn(Optional.of(item));

        Item result = itemService.getItemById(itemId);

        assertEquals(item, result);
    }

    @Test
    public void testGetAllItems() {
        List<Item> itemList = Arrays.asList(
            new Item(1L, "Item 1", 10.0),
            new Item(2L, "Item 2", 20.0)
        );

        when(itemRepository.findAll()).thenReturn(itemList);

        List<Item> result = itemService.getAllItems();

        assertEquals(itemList, result);
    }

    @Test
    public void testAddItem() {
        Item newItem = new Item(null, "New Item", 15.0);
        Item savedItem = new Item(1L, "New Item", 15.0);

        when(itemRepository.save(newItem)).thenReturn(savedItem);

        itemService.addItem(newItem);

        verify(itemRepository, times(1)).save(newItem);
    }

    @Test
    public void testUpdateItem() {
        Long itemId = 1L;
        Item existingItem = new Item(itemId, "Existing Item", 25.0);
        Item updatedItem = new Item(itemId, "Updated Item", 30.0);

        when(itemRepository.findById(itemId)).thenReturn(Optional.of(existingItem));
        when(itemRepository.save(updatedItem)).thenReturn(updatedItem);

        itemService.updateItem(updatedItem);

        verify(itemRepository, times(1)).findById(itemId);
        verify(itemRepository, times(1)).save(updatedItem);
    }

    @Test
    public void testDeleteItem() {
        Long itemId = 1L;

        itemService.deleteItem(itemId);

        verify(itemRepository, times(1)).deleteById(itemId);
    }
}
*/
