using System.ComponentModel.DataAnnotations;

namespace Assignment305.Models
{
    public class Tenant
    {
        [Key]
        public int Id { get; set; }
        public ICollection<RentalContract> Contracts { get; set; }
    }
}
