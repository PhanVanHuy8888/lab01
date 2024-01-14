USE [CustomerManager]
GO
/****** Object:  Table [dbo].[Customer]    Script Date: 14/1/2024 9:54:02 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Customer](
	[CusID] [int] NULL,
	[CusUser] [varchar](25) NULL,
	[CusPass] [varchar](32) NULL,
	[CusName] [nvarchar](50) NULL,
	[CusPhone] [varchar](12) NULL,
	[CusAdd] [nvarchar](255) NULL,
	[CusEmail] [varchar](50) NULL,
	[CusFacebook] [nvarchar](150) NULL,
	[CusSkyper] [nvarchar](150) NULL,
	[CusStatus] [tinyint] NULL
) ON [PRIMARY]
GO
