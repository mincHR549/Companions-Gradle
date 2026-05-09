# Companions-G

Minecraft 服务器宠物/同伴插件，支持多个版本。

## 版本支持

| 模块 | 版本 | 状态 |
|------|------|------|
| companions-1_8_R1 | 1.8.x | ✅ |
| companions-1_9_R1 | 1.9.x | ✅ |
| companions-1_10_R1 | 1.10.x | ✅ |
| companions-1_11_R1 | 1.11.x | ✅ |
| companions-1_12_R1 | 1.12.x | ✅ |
| companions-1_13_R1 | 1.13.x | ✅ |
| companions-1_13_R2 | 1.13.2 | ✅ |
| companions-1_14_R1 | 1.14.x | ✅ |
| companions-1_15_R1 | 1.15.x | ✅ |
| companions-1_16 | 1.16.1 | ✅ |
| companions-1_16_R2 | 1.16.3 | ✅ |
| companions-1_16_R3 | 1.16.5 | ✅ |
| companions-1_17_R1 | 1.17.x | ✅ |
| companions-1_18_R1 | 1.18.x | ✅ |
| companions-1_19_R3 | 1.19.x | ✅ |
| companions-1_20_R1 | 1.20.x | ✅ |
| companions-1_20_R4 | 1.20.4 | ✅ |
| companions-1_21_R1 | 1.21.x | ✅ |

## 下载

- **最新版本**: [Companions-Re-1.9.3.jar](https://github.com/mincHR549/Companions-G/releases/latest)
- **支持版本**: MC 1.8 ~ 1.21

## 构建

### 前置条件

- JDK 17+ (推荐 JDK 21)
- Gradle (项目含 wrapper)

### 快速开始

```bash
# 构建所有模块
./gradlew build

# 构建产物
./gradlew shadowJar

# 清理
./gradlew clean
```

### 构建产物

jar 文件输出到：`build/libs/Companions-Re-1.9.3.jar`

### Gradle 版本

项目使用 Gradle 8.x 配置语法。推荐使用 **Gradle 8.7** 或更高版本。

## 项目结构

```
Companions-G/
├── build.gradle              # 根构建配置
├── settings.gradle           # 模块列表
├── companions-api/            # 主插件模块
│   ├── build.gradle
│   └── src/main/
│       ├── java/me/astero/companions/   # 插件源码
│       └── resources/                   # 插件资源
├── companions-1_8_R1 ~ companions-1_21_R1/  # NMS 版本模块
└── build/libs/              # 构建产物
```

## 添加新版本

1. 在 `settings.gradle` 添加 `include 'companions-1_X_RY'`
2. 创建目录 `companions-1_X_RY/src/main/java/.../packets/`
3. 复制近似版本实现，改名并调整 NMS API
4. 运行 `./gradlew build` 编译测试

## 依赖

- **Spigot API** — compileOnly，运行时由服务器提供
- **Lombok** — 编译时使用
- **Vault API** — 经济功能（可选）
- **PlaceholderAPI** — 变量支持（可选）
