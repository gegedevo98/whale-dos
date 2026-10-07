using system;
using System.Net.Http;
using System.Threading.Tasks;

namespace app;
{
  class Program
  {
    static void Main(string[] args)
    {
      var client = new HttpClient();
      var content = new StringContent("{\"value\":HELLOTHISISBEINGSPAMMEDLOL}", Encoding.UTF8, "application/json")
      int i = 1;
      while (i > 0)
      {
        
      }
    }
  }
}
